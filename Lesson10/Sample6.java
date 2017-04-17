class Sample6 {
   public static void main(String[] args) {
      Car car1;
      System.out.println("car1を宣言しました。");
      System.out.println();

      car1 = new Car();
      car1.setCar(1234, 20.5);

      System.out.println();

      Car car2;
      System.out.println("car2を宣言しました。");

      System.out.println();

      car2 = car1;
      System.out.println("car2にcar1を代入しました。");

      System.out.println();

      System.out.print("car1がさす");
      car1.show();

      System.out.println();

      System.out.print("car2がさす");
      car2.show();
   }
}
