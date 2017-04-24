//eigo 123 !#$%&=~| にほん語 の読み込み確認

import java.io.*;

class ErrorTest1 {
   public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader (new InputStreamReader(System.in);//エラー用に括弧を削除
   }
}

class A {
   String str = "{{ (";//ダブルクォーテーション内の括弧
}

class B {
   char c1 = '(';
   char c2 = '{';//シングルクォーテーション内の括弧
}

class C {
   //{{ ( コメント内の括弧
}

class D {
   /*

   {{
   ((

   */ //複数行コメントの中の括弧
}

class E { //ネストの括弧
   void test() {
      if(true) {
         if(true) {
            if(true) {
               ;
            } else {
               ;
            //} エラー用コメントアウト
         } else {
            ;
         }
      } else {
         ;
      }
   }
//} エラー用コメントアウト
