class Car {
   private int num;
   private double gas;

   public Car() {
      num = 0;
      gas = 0.0;
      System.out.println("車を作成しました。");
   }

   public Car(int n, double g) {
      num = n;
      gas = g;
      System.out.println("作成したナンバー　:" + num);
      System.out.println("作成したガソリン量:" + gas);
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

   public RacingCar(int n, double g, int c) {
      super(n, g);
      course = c;
      System.out.println("作成したコース番号:" + course);
   }

   public void setCourse(int c) {
      course = c;
      System.out.println("設定したコース番号:" + course);
   }
}

class Sample2 {
   public static void main(String[] args) {
      RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
   }
}
