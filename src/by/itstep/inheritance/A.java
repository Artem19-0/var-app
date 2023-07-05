package by.itstep.inheritance;

public class A {
    int a;

  void m1(){
      System.out.println("m1: inside A");
  }
}


class B extends A {
    int b;

    void m2() {
        System.out.println("m2: inside B");
    }
}



class C extends A{
    int c;

    @Override
    void m1() {
        super.m1();
        System.out.println("m2: inside C");
    }
    void m3(){
        System.out.println("m3: inside C");
    }
}




class D extends B{
   int d;

    @Override
    void m1() {
        super.m1();
        System.out.println("m1: inside D");
    }


    @Override
    void m2() {
        super.m2();
        System.out.println("m2: inside D");
    }


    void m3(){
        System.out.println("m3: inside D");
    }

}




class E extends D{
   int e;

   void m4(){
       System.out.println("m4: inside E");
   }
}
class ABCDE{
    public static void main(String[] args) {
        E e = new E();
        e.m1();
        e.m2();
        e.m3();
        e.m4();

        C c = new C();
        c.m1();
        c.m3();

    }
}