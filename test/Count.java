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
      int max = 0;

      for(int i = 0; i < 52; i++) {
         for(int j = 0; j < str.length(); j++) {
            if(target[i] == str.charAt(j);) {
               count++;
            }
         }
         if(count > max) {
            max = count;
         }
         num[i] += count;
         count = 0;
      }

      while(max > 0) {
         for(int i = 0; i < num.length; i++) {
            if(num[i] >= max) {
               System.out.print("*");
            } else {
               System.out.print(" ");
            }
         }
         max--;
         System.out.println("改行");
      }
      for(int i = 0; i < target.length; i++) {
         // if(num[i] > 0) {
            System.out.print(target[i]);
         // }
      }
   }
}
