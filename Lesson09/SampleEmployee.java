class SampleEmployee {
   public static int sum = 0;

   private String name;
   private String gender;
   private int num;
   private int age;

   SampleEmployee(String na, String g, int a) {
      name = na;
      gender = g;
      age = a;

      sum++;
      num = sum;

      System.out.println("新しい従業員が登録されました。");
   }

   String getName() {
      return name;
   }
   String getGender() {
      return gender;
   }
   int getAge() {
      return age;
   }
   int getNum() {
      return num;
   }
   int getSum() {
      return sum;
   }

   void info() {
      System.out.println("name   :" + name);
      System.out.println("gender :" + gender);
      System.out.println("age    :" + age);
      System.out.println("num    :" + num);
   }
}
