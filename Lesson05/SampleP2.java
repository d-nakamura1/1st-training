import java.io.*;

class SampleP2 {
   public static void main(String[] args) throws IOException {
      System.out.println("2つの整数を入力してください。");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str1 = br.readLine();
      String str2 = br.readLine();

      int res1 = Integer.parseInt(str1);
      int res2 = Integer.parseInt(str2);

      if(res1 == res2){
         System.out.println("2つの数は同じ値です。");
      }else if(res1 < res2){
         System.out.println("\"" + res1 + "\"より\"" + res2 + "\"のほうが大きい値です。");
      }else{
         System.out.println("\"" + res2 + "\"より\"" + res1 + "\"のほうが大きい値です。");
      }
   }
}
