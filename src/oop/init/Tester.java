package oop.init;

public class Tester {
    int val;

    static {
        System.out.println("Test static block");
    }
    Tester(){
        System.out.println("Tester construct ");
        System.out.println(val);
    }
    public static void main(String[] args) {
       new Tester();
       // new Third();
        //parent - child - third
        // статика - не статика - конструктор




        System.out.println(Parent.getpStatic());
    }
}
