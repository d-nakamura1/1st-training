import java.io.*;

class pascal {
   public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int num = Integer.parseInt(str);

      int[] triangle1 = new int[num];
      triangle1[0] = 1;
      triangle1[1] = 0;

      int[] triangle2 = new int[num];

      for (int i = 0; i < num + 1; i++) {
         int j;
         for (j = num - i; j > 0; j--) {
            System.out.print(" ");
         }
         for (j = 0; j < i; j++) {
            System.out.print(triangle1[j] + " ");
         }

         triangle2[0] = triangle1[0];

         for (j = 0; j < i + 1; j++) {
            triangle2[j + 1] = triangle1[j] + triangle1[j + 1];
            System.out.print("j:" + j);
         }

         triangle2[j + 1] = triangle1[j + 1];

         System.out.println("a");

         for (j = 0; j < i + 1; j++) {//移動
            triangle1[j] = triangle2[j];
         }
         System.out.println();
      }
   }
}
