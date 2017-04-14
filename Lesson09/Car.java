class Car {
   public static int sum = 0;

   int num;
   double gas;
   // private int num;
   // private double gas;

   public Car() {
      num = 0;
      gas = 0.0;
      sum++;
      System.out.println("車を作成しました。");
   }
   public Car(int n, double g) {
      this();
      num = n;
      gas = g;
      System.out.println("ナンバー\"" + num + "\"ガソリン量\"" + gas + "の車を作成しました。");
   }

   public void setCar(int n) {
      num = n;
      System.out.println("ナンバーを\"" + num + "\"にしました。");
   }
   public void setCar(double g) {
      gas = g;
      System.out.println("ガソリン量を\"" + gas + "\"にしました。");
   }
   public void setCar(int n, double g) {
      num = n;
      gas = g;
      System.out.println("ナンバーを\"" + num + "\"にガソリン量を\"" + gas + "\"にしました。");
   }

   public void setNumGas(int n, double g) {
      if (g > 0 && g < 1000) {
         num = n;
         gas = g;
         System.out.println("ナンバーを\"" + num + "\"にガソリン量を\"" + gas + "にしました。");
      } else {
         System.out.println("\"" + g + "\"は正しいガソリン量ではありません。");
         System.out.println("ガソリン量を変更できませんでした。");
      }
   }

   public static void showSum() {
      System.out.println("車は全部で\"" + sum + "\"台あります。");
   }

   public void show() {
      System.out.println("車のナンバーは\"" + num + "\"です。");
      System.out.println("ガソリン量は\"" + gas + "\"です。");
   }
}
