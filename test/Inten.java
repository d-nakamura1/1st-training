class Inten {
   public static void main(String[] args) {

      long x = 0;
      long y = 0;
      long cnt = 0;

      long num = 65536 * 16;
      while((y & num) < num) {
         if((x * x + y * y) < (num * num)) {
            cnt++;
         }
         x++;
         y += (x & num) / num;

         x &= ~num;
      }
      System.out.println(cnt);
      System.out.println((double)cnt / (num * num) * 4);
   }
}
