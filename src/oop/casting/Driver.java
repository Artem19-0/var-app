package oop.casting;

import oop.Cat;

public class Driver {

    private char [] types;


    public  void drive(){
        System.out.println("driving....");
    }



    public  void shareDocs(){

        System.out.println("sharing documents... , Types: " );
        for(char type : types){
            System.out.println(type);
        }
    }



    public Driver(char[] types) {
        this.types = types;
    }


    public char[] getTypes() {
        return types;
    }

    public void setTypes(char[] types) {
        this.types = types;
    }
}


class Programmer extends Driver{
    public Programmer(char[] types) {
        super(types);
    }

    public void writCod(){
        System.out.println("писать код...");
    }
}


class Student extends Driver{


    public Student(char[] types) {
        super(types);
    }


    public void study(){
        System.out.println("читься....");
    }
}
class Test{

    public static void testDriver(Driver driver){
        driver.shareDocs();
        driver.drive();
        if( driver instanceof Programmer) {
            Programmer p = (Programmer) driver;
            p.writCod();
        }else {
            Student p1 = (Student) driver;
            p1.study();
        }
    }


    public static void main(String[] args) {
        char[] types1 = {'A' , 'B'};
        Driver d1 = new Driver(types1);
        d1.drive();
        d1.shareDocs();



        char[] types2 = { 'B'};
        Programmer p1 = new Programmer(types2);
        p1.drive();
        p1.writCod();
        p1.drive();
        p1.shareDocs();

        //is - a rel
        Driver d2 = p1;

        Object o1 = p1;


        Object o2 = new int[5];
        Object o3 = new Cat();
        Object o4 = 15;


        //DownCasting
        Programmer p10 = (Programmer) d2;
        p10.writCod();


        //
        Driver d10 = new Programmer(types1);

        if(d10 instanceof Student) {//instanceof - оператор который проверит ссылку, а в данном случает объект на пренадлежность иерархи данного типа
            Student st1 = (Student) d10;
            st1.study();
        }else {
            System.out.println(" d10 is not a student");
        }

        if (d10.getClass() == Student.class){//проверка на совпадение с указанным классом .Проверка на вложенность отсутсвует
            Student st1 = (Student) d10;
            st1.study();
        }else {
            System.out.println("d10 is not a S");
        }

        //
        Object o100 = new Triangle(3,6,8);

        Shape sh100 = (Shape) o100;

        Object o200 = sh100;

        System.out.println(((Triangle)o100).getColor());

        char [] t = { 'D'};
        Object o1000 = new Student(t);
        testDriver((Driver) o1000);
    }
}