package by.itstep.inheritance.animals;

public class Cat extends DAanimal{

    void sleep(){
        super.sleep();
        super.sleep();
        super.sleep();
    }

    void eat(){
        System.out.println(getName() + " eat() -> milk");
    }


    void play(){
        System.out.println(getName() + " playing with mouse");
    }

    @Override
    void voice() {
        super.voice();
        System.out.println("meow - meow - meooow");
    }
}
