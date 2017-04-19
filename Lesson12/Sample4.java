//乗り物インターフェイス
interface iVehicle {
   void vShow();
}
//材料インターフェイス
interface iMaterial {
   void mShow();
}
//車クラス
class Car implements iVehicle, iMaterial {
   private int num;
   private double gas;

   public Car(int n, double g) {
      num = n;
      gas = g;
      System.out.println("作成したナンバー　：" + num);
      System.out.println("作成したガソリン量：" + gas);
   }
   public void vShow() {
      System.out.println("ナンバー　表示：" + num);
      System.out.println("ガソリン量表示：" + gas);
   }
   public void mShow() {
      System.out.println("材料は鉄です。");
   }
}

class Sample4 {
   public static void main(String[] args) {
      Car car1 = new Car(1234, 20.5);
      car1.vShow();
      car1.mShow();
   }
}
