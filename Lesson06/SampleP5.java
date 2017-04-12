import java.io.*;

class SampleP5 {
   public static void main(String[] args) throws IOException {
      System.out.println("2以上の整数を入力してください。");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      int cnt = 0;
      int i;
      double root = Math.sqrt(res);
      for (i = 2; i <= root; i++) {
         if (res % i == 0) {
            break;
         }
      }
      //System.out.println(root);
      if (i <= root) {
         System.out.println("\"" + res + "\"は素数ではありません。");
      } else {
         System.out.println("\"" + res + "\"は素数です。");
      }
   }
}
