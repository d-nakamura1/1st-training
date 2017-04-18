class Car {
   private int num;
   private double gas;

   public Car() {
      num = 0;
      gas = 0.0;
      System.out.println("車を作成しました。");
   }

   public void setCar(int n, double g) {
      num = n;
      gas = g;
      System.out.println("設定したナンバー　:" + num);
      System.out.println("設定したガソリン量:" + gas);
   }

   public void show() {
      System.out.println("ナンバー表示　:" + num);
      System.out.println("ガソリン量表示:" + gas);
   }
}

class RacingCar extends Car{
   private int course;

   public RacingCar() {
      course = 0;
      System.out.println("レーシングカーを作成しました。");
   }
   public void setCourse(int c) {
      course = c;
      System.out.println("設定したコース番号:" + course);
   }
}

class Sample1 {
   public static void main(String[] args) {
      RacingCar rccar1;
      rccar1 = new RacingCar();

      rccar1.setCar(1234, 20.5);
      rccar1.setCourse(5);
   }
}
