class Car {
   protected int num;
   protected double gas;

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
      System.out.println();
   }

   public void show() {
      System.out.println("ナンバー　表示:" + num);
      System.out.println("ガソリン量表示:" + gas);
      System.out.println();
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
      System.out.println();
   }

   public void show() {
      System.out.println("ナンバー　表示:" + num);
      System.out.println("ガソリン量表示:" + gas);
      System.out.println("コース番号表示:" + course);
      System.out.println();
   }
}

class Sample6 {
   public static void main(String[] args) {
      Car[] cars;
      cars = new Car[2];

      cars[0] = new Car();
      cars[0].setCar(1234, 20.5);

      cars[1] = new RacingCar();
      cars[1].setCar(4567, 30.5);

      for (int i = 0; i < cars.length; i++) {
         cars[i].show();
      }
   }
}
