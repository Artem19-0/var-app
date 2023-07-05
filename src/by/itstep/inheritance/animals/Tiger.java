package by.itstep.inheritance.animals;

public class Tiger extends Cat{

    void attack(){
        System.out.println(getName() + " attack() people");
    }


    @Override
    void eat() {
        System.out.println(" ");
    }
}
