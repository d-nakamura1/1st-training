//乗り物インターフェイス
interface iVehicle {
   void show();
}
//車クラス
class Car implements iVehicle {
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
   }
}
class Plane implements iVehicle {
   private int flight;

   public Plane(int f) {
      flight = f;
      System.out.println("作成した便：" + flight);
   }
   public void show() {
      System.out.println("便　表示：" + flight);
   }
}

class Sample3 {
   public static void main(String[] args) {
      iVehicle[] ivc;
      ivc = new iVehicle[2];

      ivc[0] = new Car(1234, 20.5);

      ivc[1] = new Plane(232);

      for(int i = 0; i < ivc.length; i++) {
         ivc[i].show();
      }
   }
}
