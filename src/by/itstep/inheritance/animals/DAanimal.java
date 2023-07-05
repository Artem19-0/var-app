package by.itstep.inheritance.animals;

import oop.Person;

public class DAanimal extends  Animal{



    private Person owner;

    public Person getOwner() {
        return owner;
    }


    public void setOwner(Person owner) {
        this.owner = owner;
    }



    void sleep(){
        System.out.println(getName() + " is sleeping .... ZzZzZz" );
    }


    void eat(){
        System.out.println(getName() + " eat() ");
    }


    void play(){
        System.out.println(getName() + " play()");
    }

    void voice (){
        System.out.println("some voice...");
    }
}
