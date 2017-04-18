import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
      set = 'A';
      for(int i = 26; i < 52; i++) {
         target[i] = set;
         set++;
      }

      int[] num = new int[52];

      for(int i = 0; i < 52; i++) {
         for(int j = 0; j < str.length(); j++) {
            char x = str.charAt(j);
            if(x == target[i]) {
               count++;
            }
         }
         num[i] = count;
         count = 0;
      }

      for(int i = 0; i < target.length; i++) {
         if(num[i] > 0) {
            System.out.println(target[i] + "" + num[i]);
         }
      }
   }
}
