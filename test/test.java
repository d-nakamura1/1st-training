import java.io.*;

class test{
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();

      String str1 = str;

      str = "abc";

      System.out.println(str);
      System.out.println(str1);
   }
}
