//乗り物クラス
abstract class Vehicle {
   protected int speed;

   public void setSpees(int s) {
      speed = s;
      System.out.println("速度：" + speed);
   }
   abstract void show();
}
//車クラス
class Car extends Vehicle {
   private int num;
   private double gas;

   public Car(int n, double g) {
      num = n;
      gas = g;
      System.out.println("作成したナンバー　：" + num);
      System.out.println("作成したガソリン量：" + gas);
   }
   public void show() {
      System.out.println("ナンバー　表示：" + num);
      System.out.println("ガソリン量表示：" + gas);
      System.out.println("速度　　　表示：" + speed);
   }
}
//飛行機クラス
class Plane extends Vehicle {
   private int flight;

   public Plane(int f) {
      flight = f;
      System.out.println("作成した便：" + flight);
   }
   public void show() {
      System.out.println("便　表示：" + flight);
      System.out.println("速度表示：" + speed);
   }
}

class Sample2 {
   public static void main(String[] args) {
      Vehicle[] vc;
      vc = new Vehicle[2];

      vc[0] = new Car(1234, 20.5);
      vc[1] = new Plane(232);

      for(int i = 0; i < vc.length; i++) {
         if(vc[i] instanceof Car) {
            System.out.println("\"" + (i + 1) + "\"番目のオブジェクトはCarクラスです。");
         } else {
            System.out.println("\"" + (i + 1) + "\"番目のオブジェクトはCarクラスではありません。");
         }
      }
   }
}
