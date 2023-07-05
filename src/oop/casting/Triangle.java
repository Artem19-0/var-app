package oop.casting;

public class Triangle extends Shape{

    private double a , b , c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }




    @Override
    public void print() {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/____\\");
    }

    @Override
    public void calculateS() {

        double p = a + b + c;
        setP(p);
    }

    @Override
    public void calculateP() {
        double p = (a + b + c )/2;
     double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
     setS(s);
    }



    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }



}
