import java.io.*;
import java.util.regex.*;
import java.util.*;

class LengthException extends Exception {
}
class JavaFileException extends Exception {
}
class NoBracketsException extends Exception {
}
class NoFinishException extends Exception {
}

class SourceChecker {
   private static final String REGEX = ".java$";
   private static final Pattern PATTERN = Pattern.compile(REGEX);
   private static final char LEFT_BIC = '{';
   private static final char LEFT_CIRCLE = '(';
   private static final char RIGTH_BIC = '}';
   private static final char RIGTH_CIRCLE = ')';
   public static void main(String[] args) {

      try {
         fileChecker(args);//引数が正しいかのチェック

         BufferedReader br = null;
         int flag = 0;
         try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]),"UTF-8"));

            String str;
            int cnt = 0;
            int numOfLine = 1;
            int errorFlag = 0;
            List<Integer> point = new ArrayList<Integer>();
            List<Character> brackets = new ArrayList<Character>();

            while((str = br.readLine()) != null) {
               String line = str + '\n';
               char moji;

               int num = 0;
               while((moji = line.charAt(num)) != '\n') {
                  if(flag == 1) { //一行コメントの中
                     if(line.charAt(num + 1) == '\n') {
                        flag = 0;
                     }
                  } else if(flag == 2) { //複数行コメントの中
                     if(moji == '*' && line.charAt(num + 1) == '/') {
                        flag = 0;
                     }
                  } else if(flag == 3) { //文字列の中
                     if(moji == '\"') {
                        flag = 0;
                     }
                  } else if(flag == 4) { //文字の中
                     if(moji == '\'') {
                        flag = 0;
                     }
                  } else { //括弧を探す
                     if(moji == LEFT_BIC) {
                        point.add(numOfLine * 1000 + (num + 1)); //行と文字数の登録
                        brackets.add(LEFT_BIC);
                        cnt++;
                     } else if(moji == RIGTH_BIC) {
                        if(brackets.size() != 0 && brackets.get(brackets.size() - 1) == LEFT_BIC) {
                           point.remove(point.size() - 1);
                           brackets.remove(brackets.size() - 1);
                        } else {
                           System.out.println(numOfLine + "行の" + (num + 1) + "文字目の\"" + moji + "\"に対する開始の括弧がありません。");
                           errorFlag = 1;
                        }
                        cnt++;
                     } else if(moji == LEFT_CIRCLE) {
                        point.add(numOfLine * 1000 + (num + 1)); //行と文字数の登録
                        brackets.add(LEFT_CIRCLE);
                        cnt++;
                     } else if(moji == RIGTH_CIRCLE) {
                        if(brackets.size() != 0 && brackets.get(brackets.size() - 1) == LEFT_CIRCLE) {
                           point.remove(point.size() - 1);
                           brackets.remove(brackets.size() - 1);
                        } else {
                           System.out.println(numOfLine + "行の" + (num + 1) + "文字目の\"" + moji + "\"に対する開始の括弧がありません。");
                           errorFlag = 1;
                        }
                     } else if(moji == '/') {
                        if(line.charAt(num + 1) == '/') { //一行コメントの始まり
                           flag = 1;
                        } else if(line.charAt(num + 1) == '*') { //複数行コメントの始まり
                           flag = 2;
                           num++; //一文字飛ばす
                        }
                     } else if(moji == '\"') { //文字列の始まり
                        flag = 3;
                     } else if(moji == '\'') { //文字の始まり
                        flag = 4;
                     }
                  }
                  if(moji == '\\' && line.charAt(num + 1) != '\n') { //エスケープシーケンスを飛ばす
                     num++; //一文字飛ばす
                  }
                  num++; //一文字進める
               }
               numOfLine++; //何行目か
            }

            //表示
            if(cnt <= 0) {
               throw new NoBracketsException(); //括弧が一つもない
            }
            if(flag > 1) {
               throw new NoFinishException(); //コメントなどが終わっていないままファイル終了
            }

            if(point.size() == 0 && errorFlag == 0) { //括弧のエラーがなかった場合
               System.out.println("括弧の対応はすべて正しいです。");
            } else {
               for(int i = 0; i < point.size(); i++) { //開く括弧のエラー表示
                  System.out.println(point.get(i)/1000 + "行の" + point.get(i)%1000 + "文字目の\"" + brackets.get(i) + "\"に対する終了の括弧がありません。");
               }
            }
         } catch (IOException e) {
            System.out.println("ファイルが存在しないか開くことが出来ませんでした。");
         } catch (NoBracketsException e) {
            System.out.println("括弧が存在しませんでした。");
         } catch (NoFinishException e) {
            switch (flag) {
               case 2:
                  System.out.println("コメントに終わりがありません。");
                  break;
               case 3:
                  System.out.println("文字列に終わりがありません。");
                  break;
               case 4:
                  System.out.println("文字に終わりがありません。");
                  break;
            }
         } finally {
            try {
               if(br != null) {
                  br.close();
               }
            } catch (IOException e) {
               System.out.println("入出力エラーです。");
            }
         }
      } catch (LengthException e) {
         System.out.println("usage:java SourceChecker \"javaファイル名\"");
      } catch (JavaFileException e) {
         System.out.println(args[0] + "が指定されたのでjavaファイルを指定してください。");
      }
   }

   public static void fileChecker (String[] str) throws LengthException, JavaFileException{
      if(str.length != 1) { //main引数が1つかどうか
         throw new LengthException();
      }

      Matcher m = PATTERN.matcher(str[0]);

      if (!m.find()){ //引数が.javaかどうか
         throw new JavaFileException();
      }
   }
}
