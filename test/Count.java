import java.io.*;

class Count {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();

      int count = 0;

      char[] target = new char[52];

      char set = 'a';
      for(int i = 0; i < 26; i++) {
         target[i] = set;
         set++;
      }
      set = 'A'
      for(int i = 26; i < 52; i++) {
         target[i] = set;
         set++;
      }


      for(i = 0; i < 52; i++) {
         for(){
            if(x == target){
               count++;
            }
         }
         if(count > 0) {
            System.out.println(target + "" + count);
         }
         target++;
         count = 0;
      }
   }
}
