import java.io.*;

class Sample10 {
   public static void main(String[] args) {
      if(args.length != 1) {
         System.out.println("ファイル名を正しく指定してください。");
         System.exit(1);
      }
      BufferedReader br = null;
      try {
         br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]),"UTF-8"));

         String str;

         while((str = br.readLine()) != null) {
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
