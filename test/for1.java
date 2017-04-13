class for1 {
   public static void main(String[] args) {
      for (int i = 1; i <= 9; i++) {
         for (int j = i; j < i * 10; j += i){
            System.out.print(j + "\t");
         }
         System.out.println();
      }
   }
}
