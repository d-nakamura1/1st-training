class Inten {
   public static void main(String[] args) {

      int x = 0;
      int y = 0;
      double cnt = 0.0;

      int num = 65536 * 2;
      while((y & num) < num) {
         if((x * x + y * y) < (num * num)) {
            cnt++;
         }
         x++;
         y += (x & num) / num;

         x &= ~num;
      }
      System.out.println(cnt);
      System.out.println(cnt / (num * num) * 4.0);
   }
}
