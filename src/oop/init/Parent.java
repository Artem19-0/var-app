package oop.init;

public class Parent {

    private int p;
    private static int pStatic;


    static {
        System.out.println("Parent Static block begin");
        System.out.println(pStatic);
        pStatic = 1234;
        System.out.println(pStatic);
        System.out.println("Parent Static block end");
        System.out.println();
    }


     {
        System.out.println("Parent non - static block begin");
        System.out.println(p);
        pStatic = 111;
        System.out.println(p);
        System.out.println("Parent non - static block end");
         System.out.println();

    }

    public Parent(){
        System.out.println("Parent constructor begin");
        p = 222;
        System.out.println(p);
        System.out.println("Parent constructor end");
        System.out.println();

    }

    public int getP() {
        return p;
    }


    public static int getpStatic() {
        return pStatic;
    }
}
