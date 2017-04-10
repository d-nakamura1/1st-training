import java.io.*;

class SampleP2 {
   public static void main(String[] args) throws IOException {
      System.out.print("正方形の辺の長さを入力してください。-->");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();

      int num = Integer.parseInt(str);

      num *= num;

      System.out.println("正方形の面積は\"" + num + "\"です。");
   }
}
