import java.io.*;

class BinarySearch {
   public static void main(String[] args) throws IOException {
      int[] search = new int[100];

      for (int i = 0; i < 100; i++) {
         search[i] = i;
      }

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int num = Integer.parseInt(str);

      int min = 0;
      int max = search.length - 1;

      int flag = (min + max) / 2;

      while (num != search[flag] && min <= max) {
         System.out.println("flag:" + flag + "\tmin:" + min + "\tmax:" + max);
         if (num < search[flag]) {
            max = flag - 1;
         } else {
            min = flag + 1;
         }
         flag = (min + max) / 2;
      }

      System.out.println("最後：" + flag + min + max);

      if (min <= max) {
         System.out.println("結果\"" + search[flag] + "\"   " + flag);
      } else {
         System.out.println("見つかりませんでした。");
      }
   }
}
