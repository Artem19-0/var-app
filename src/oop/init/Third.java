package oop.init;

public class Third extends Child {

    private int p;
    private static int pStatic;


    static {
        System.out.println("Third Static block begin");
        System.out.println(pStatic);
        pStatic = 444;
        System.out.println(pStatic);
        System.out.println("Third Static block end");
        System.out.println();
    }


    {
        System.out.println("Third non - static block begin");
        System.out.println(p);
        pStatic = 555;
        System.out.println(p);
        System.out.println("Third non - static block end");
        System.out.println();

    }

    public Third(){
        System.out.println("Third constructor begin");
        p = 661;
        System.out.println(p);
        System.out.println("Third constructor end");
        System.out.println();

    }

    public int getP() {
        return p;
    }


    public static int getpStatic() {
        return pStatic;
    }

}
