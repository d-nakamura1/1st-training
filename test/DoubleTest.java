class DoubleTest {
   public static void main(String[] args) {
      int numX = 0;
      int numY = 0;

      while((numY & 16) < 16) {
         System.out.println(numX + " " + numY);
         numX++;
         numY += (numX & 16) / 16;

         numX &= ~16;
      }
   }
}
