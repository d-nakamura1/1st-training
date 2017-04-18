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
   }

   public void show() {
      System.out.println("ナンバー　表示:" + num);
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

   public void show() {
      System.out.println("ナンバー　表示:" + num);
      System.out.println("ガソリン量表示:" + gas);
      System.out.println("コース番号表示:" + course);
   }
}

class Sample4 {
   public static void main(String[] args) {
      RacingCar rccar1 = new RacingCar();

      rccar1.setCar(1234, 20.5);
      rccar1.setCourse(5);

      rccar1.show();
   }
}
