import java.io.*;

class test{
   public static void main(String[] args) throws IOException {
      int cnt = 0;

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);


      for (int i = 2; i <= res; i++){
         if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
            cnt++;
            System.out.println(i);
         }
      }

      System.out.println("個数：" + cnt);
   }
}
