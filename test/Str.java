class Str {
   public static void main(String[] args) {
      int num = 123;
      StringBuffer sb = new StringBuffer(String.valueOf(num));
      String name = sb.reverse().toString();
      System.out.println(Integer.parseInt(name));
   }
}
