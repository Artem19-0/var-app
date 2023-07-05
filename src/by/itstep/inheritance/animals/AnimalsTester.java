package by.itstep.inheritance.animals;

import oop.Person;

public class AnimalsTester {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();

        tiger.setName("God");
        tiger.eat();
        tiger.attack();
        tiger.play();
        tiger.sleep();


        MiniDog dog = new MiniDog();

        dog.eat();
        dog.sleep();
        dog.play();
        dog.voice();


        Person o1 = new Person();
        o1.setName("John");
        tiger.setOwner(o1);
    }



}
