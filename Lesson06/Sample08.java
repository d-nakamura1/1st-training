class Sample08 {
   public static void main(String[] args) {
      boolean bl = false;
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            if(bl == false) {
               System.out.println("*");
               bl = true;
            }else{
               System.out.println("-");
               bl = false;
            }
         }
         System.out.println("\n");
      }
   }
}
