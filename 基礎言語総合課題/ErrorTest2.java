import java.io.*;

class ErrorTest2 {
   public static void main(String[] args) {
      if(args.length != 1) //{ エラー用コメントアウト
         System.out.println("ファイル名を正しく指定してください。");
         System.exit(1);
      }
      BufferedReader br = null;
      try {
         br = new BufferedReader new FileReader(args[0]));//エラー用に括弧を削除

         String str;

         while((str = br.readLine()) != null) //{ エラー用コメントアウト
            System.out.println(str);
         }

      } catch (IOException e) {
         System.out.println("入出力エラーです。");
      } finally {
         try {
            br.close();
         } catch (IOException e) {
            System.out.println("入出力エラーです。");
         }
      }
   }
}
