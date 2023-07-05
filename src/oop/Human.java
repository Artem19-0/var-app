package oop;

public class Human { // про статические методы и не статические

    private static int counter;
    private int age;
    private String name;


    public Human(){
        System.out.println("human + 1");
        counter++;
        age++;
    }



    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Human.counter = counter;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Test1{
    public static void main(String[] args) {

     Human h1 =  new Human();
     int age = h1.getAge();


        new Human();
        new Human();
        new Human();


        int a = Human.getCounter();

        System.out.println("human counter " + a);
        System.out.println("human age " + age);
    }
}