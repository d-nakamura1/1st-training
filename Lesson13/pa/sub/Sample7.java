package pa.sub;

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
      System.out.println("設定したナンバー　：" + num);
      System.out.println("設定したガソリン量：" + gas);
   }
   public void show() {
      System.out.println("ナンバー　表示：" + num);
      System.out.println("ガソリン量表示：" + gas);
   }
}

class Sample7 {
   public static void main(String[] args) {
      Car car1 = new Car();
      car1.show();
   }
}
