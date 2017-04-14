class Sample8 {
   public static void main(String[] args) {
      Car.showSum();

      System.out.println();//

      Car car1 = new Car();

      car1.setCar(1234, 20.5);

      System.out.println();//

      Car.showSum();

      System.out.println();//

      Car car2 = new Car();
      car2.setCar(4567, 30.5);

      System.out.println();//

      Car.showSum();
   }
}
