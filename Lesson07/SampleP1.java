import java.io.*;

class SampleP1 {
   public static void main(String[] args) throws IOException {

      System.out.println("5人のテストの点数を入力してください。");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int[] test = new int[5];

      int max = test[0];
      for (int i = 0; i < test.length; i++) {
         String str = br.readLine();
         int num = Integer.parseInt(str);
         test[i] = num;

         if (max < num) {
            max = num;
         }
      }

      for (int i = 0; i < test.length; i++) {
         System.out.println("\"" + (i + 1) + "\"番目の人の点数は\"" + test[i] + "\"です。");
      }

      System.out.println("最高点は\"" + max + "\"点です。");
   }
}
