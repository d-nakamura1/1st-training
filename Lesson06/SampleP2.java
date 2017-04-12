import java.io.*;

class SampleP2 {
   public static void main(String[] args) throws IOException {
      System.out.println("テストの点数を入力してください。(0で終了)");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int num = Integer.parseInt(str);

      int sum = 0;
      while(num > 0) {
         sum += num;
         str = br.readLine();
         num = Integer.parseInt(str);
      }
      System.out.println("テストの合計点は\"" + sum + "\"点です。");
   }
}
