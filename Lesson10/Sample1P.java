import java.io.*;

class Sample1P {
   public static void main(String[] args) throws IOException {
      System.out.println("文字列を入力してください。");

//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);

      String str = br.readLine();

      StringBuffer sb1 = new StringBuffer(str);
      StringBuffer sb2 = sb1.reverse();

      System.out.println("\"" + str + "\"を逆順にすると\"" + sb2 + "\"です。");
   }
}
