import java.io.*;

class Sample11 {
   public static void main(String[] args) throws IOException {
      System.out.println("何番目の処理を飛ばしますか？。(1～10)");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);

      for (int i = 1; i <= 10; i++) {
         if(i == res){
            continue;
         }
         System.out.println("\"" + i + "\"番目の処理です。");
      }
   }
}
