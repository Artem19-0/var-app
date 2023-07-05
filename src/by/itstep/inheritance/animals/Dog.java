package by.itstep.inheritance.animals;

public class Dog extends DAanimal{

    void serve(){
        System.out.println(getName() + " Я тебя защищаю ");
    }


    void size(){
        System.out.println("i am big");
    }

    @Override
    void voice() {
        System.out.println( getName() + " bark - bark");
    }

    @Override
    void eat() {
        System.out.println(getName() + " Dog: meat");
    }

    @Override
    void play() {
        System.out.println(getName() + " play with cat");
    }


}
