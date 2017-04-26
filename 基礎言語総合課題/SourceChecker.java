import java.io.*;
import java.util.regex.*;
import java.util.*;

class LengthException extends Exception {
   ;
}
class JavaFileException extends Exception {
   ;
}
class NoBracketsException extends Exception {
   ;
}
class NoFinishException extends Exception {
   ;
}

class SourceChecker {
   public static void main(String[] args) {

      try {
         fileChecker(args);//引数が正しいかのチェック

         BufferedReader br = null;
         int flag = 0;
         try {
            br = new BufferedReader(new FileReader(args[0]));

            String str;
            int cnt = 0;
            int numOfLine = 1;
            ArrayList<Integer> point = new ArrayList<Integer>();
            ArrayList<Character> brackets = new ArrayList<Character>();

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
                     if(moji == '\"'){
                        flag = 0;
                     }
                  } else if(flag == 4) { //文字の中
                     if(moji == '\''){
                        flag = 0;
                     }
                  } else { //括弧を探す
                     if(moji == '{') {
                        point.add(numOfLine * 1000 + (num + 1)); //行と文字数の登録
                        brackets.add('{');
                        cnt++;
                     } else if(moji == '}') {
                        if(brackets.get(brackets.size() - 1) == '{') {
                           point.remove(point.size() - 1);
                           brackets.remove(brackets.size() - 1);
                        } else {
                           point.add(numOfLine * 1000 + (num + 1));
                           brackets.add('}');
                        }
                        cnt++;
                     } else if(moji == '(') {
                        point.add(numOfLine * 1000 + (num + 1)); //行と文字数の登録
                        brackets.add('(');
                        cnt++;
                     } else if(moji == ')') {
                        if(brackets.get(brackets.size() - 1) == '(') {
                           point.remove(point.size() - 1);
                           brackets.remove(brackets.size() - 1);
                        } else {
                           point.add(numOfLine * 1000 + (num + 1));
                           brackets.add(')');
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
                  if(line.charAt(num + 1) == '\\') { //エスケープシーケンスを飛ばす
                     num++; //一文字飛ばす
                  }
                  num++; //一文字進める
               }
               numOfLine++; //何行目か
            }

            //表示
            if(cnt <= 0) {
               NoBracketsException e = new NoBracketsException();
               throw e;
            }
            if(flag > 1) {
               NoFinishException e = new NoFinishException();
               throw e;
            }

            if(point.size() != 0) {
               for(int i = 0; i < point.size(); i++) {
                  char prt = brackets.get(i);
                  if(prt == '{' || prt == '(') {
                     System.out.println(point.get(i)/1000 + "行の" + point.get(i)%1000 + "文字目の\"" + prt + "\"に対する終了の括弧がありません。");
                  } else if(prt == '}' || prt == ')') {
                     System.out.println(point.get(i)/1000 + "行の" + point.get(i)%1000 + "文字目の\"" + prt + "\"に対する開始の括弧がありません。");
                  }
               }
            } else {
               System.out.println("括弧の対応はすべて正しいです。");
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
               br.close();
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
         LengthException e = new LengthException();
         throw e;
      }
      String regex = ".java$";
      Pattern p = Pattern.compile(regex);

      Matcher m = p.matcher(str[0]);

      if (!m.find()){ //引数が.javaかどうか
         JavaFileException e = new JavaFileException();
         throw e;
      }
   }
}
