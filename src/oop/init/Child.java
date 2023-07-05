package oop.init;

public class Child extends Parent{

    private int p;
    private static int pStatic;


    static {
        System.out.println("Child Static block begin");
        System.out.println(pStatic);
        pStatic = 9888;
        System.out.println(pStatic);
        System.out.println("Child Static block end");
        System.out.println();
    }


    {
        System.out.println("Child non - static block begin");
        System.out.println(p);
        pStatic = 888;
        System.out.println(p);
        System.out.println("Child non - static block end");
        System.out.println();

    }

    public Child(){
        System.out.println("Child constructor begin");
        p = 777;
        System.out.println(p);
        System.out.println("Child constructor end");
        System.out.println();

    }

    public int getP() {
        return p;
    }


    public static int getpStatic() {
        return pStatic;
    }


}
