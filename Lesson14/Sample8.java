import java.io.*;

class Sample8 {
   public static void main(String[] args) {
      System.out.println("文字列を入力してください。");
      try {
         BufferedReader br = new BufferedReader(new FileReader("test1.txt"));

         String str1 = br.readLine();
         String str2 = br.readLine();

         System.out.println("ファイルに書き込まれている2つの文字列は");
         System.out.println("\"" + str1 + "\"です。");
         System.out.println("\"" + str2 + "\"です。");

         br.close();
      } catch (IOException e) {
         System.out.println("入出力エラーです。");
      }
   }
}
