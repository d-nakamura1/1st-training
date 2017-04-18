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

   public String toString() {
      String str = "ナンバー:" + num + "　ガソリン量:" + gas;
      return str;
   }
}

class Sample7 {
   public static void main(String[] args) {
      Car car1 = new Car();
      car1.setCar(1234, 20.5);

      System.out.println(car1);
   }
}
