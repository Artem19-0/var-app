package oop.casting;

//описать базовые проля и функции.Создать объукт типа shape  невозможно
public abstract class Shape {

    private double s;
    private double p;
    private String color;


    //абстрактные не имеют body ( их реализуют наследники)
    public abstract void print();
    public abstract void calculateS();
    public abstract void calculateP();

    public void shoInfo(){
        System.out.println("shape: S = " + s + ", P = " + p + ", Color is " + color);
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }




    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
