class Sample2 {
   public static void main(String[] args) {
      Car car1 = new Car();

      //このようなアクセスはできなくなります。
      //car1.num = 1234;
      //car1.gas = 20.5;

      car1.setNumGas(1234, 20.5);
      car1.show();

      System.out.println("正しくないガソリン量(－10)を指定してみます・・・。");

      car1.setNumGas(1234, -10);
      car1.show();
   }
}
