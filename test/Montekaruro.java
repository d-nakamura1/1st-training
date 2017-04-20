class Montekaruro {
   public static void main(String[] args) {

      double x = 0.0;
      double y = 0.0;
      int num = 10000000;
      double cnt = 0.0;
      for(int i = 0; i < num; i++) {
         x = Math.random();
         y = Math.random();

         if((x * x + y * y) < 1.0) {
            cnt++;
         }
      }

      System.out.println(cnt * 4);
   }
}
