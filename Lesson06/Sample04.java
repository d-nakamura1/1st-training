import java.io.*;

class Sample04 {
   public static void main(String[] args) throws IOException {
      System.out.println("いくつまでの合計を求めますか？");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int num = Integer.parseInt(str);

      int sum = 0;
      for(int i = 1; i <= num; i++){
         sum += i;
      }

      System.out.println("1から\"" + num + "\"までの合計は\"" + sum + "\"です。");
   }
}
