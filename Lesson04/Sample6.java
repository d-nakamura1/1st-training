import java.io.*;

class Sample6 {
   public static void main(String[] args) throws IOException {
      System.out.println("整数を3つ入力してください。");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str1 = br.readLine();
      String str2 = br.readLine();
      String str3 = br.readLine();

      int sum = 0;

      sum += Integer.parseInt(str1);
      sum += Integer.parseInt(str2);
      sum += Integer.parseInt(str3);

      System.out.println("3つの数の合計は\"" + sum + "\"です。");
   }
}
