class Sample5 {
   public static void main(String[] args) {
      int a = 3;
      int b = 0;

      b = a++;
      //b = ++a;

      System.out.println("aの値は\"" + a + "\"です。");
      System.out.println("bの値は\"" + b + "\"です。");
   }
}
