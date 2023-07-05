package oop.casting;

public class Rectangle extends Shape{

    private double a , b;

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




    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }



    public Rectangle(double a){ // если хочеш квадрат
        this(a, a);
    }

    @Override
    public void print() {
        System.out.println(" ____");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ---- ");
    }

    @Override
    public void calculateS() {
     setP(2*(a + b));
    }

    @Override
    public void calculateP() {
    setS(a * b);
    }




}
