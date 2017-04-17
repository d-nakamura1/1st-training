import java.io.*;

class Sample2P {
   public static void main(String[] args) throws IOException {
      System.out.println("文字列を入力してください。");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str1 = br.readLine();
      StringBuffer sb1 = new StringBuffer(str1);

      System.out.println("aの挿入位置を整数で入力してください。");

      String str2 = br.readLine();
      int num = Integer.parseInt(str2);
      StringBuffer sb2 = sb1.insert(num, 'a');

      System.out.println("\"" + sb2 + "\"になりました。");
   }
}
