class En {
   public static void main(String[] args) {

      double x = 0.0;
      double y = 0.0;
      double cnt = 0.0;
      while(x < 1 && y < 1) {
         if((x * x + y * y) < 1.0) {
            cnt++;
         }
         x += 0.000001;
         if(x >= 1) {
            y += 0.000001;
            x = 0.0;
         }
      }

      System.out.println(cnt * 4);
   }
}
