package by.itstep.inheritance.animals;

public class MiniDog extends DAanimal{

    void size (){
        System.out.println("я маленькая ");
    }

    @Override
    void eat() {
        System.out.println("я ем только самый дорогой корм");
    }

    @Override
    void play() {
        System.out.println("я играю");
    }

    @Override
    void voice() {
        System.out.println(" quiet bark ");
    }

    @Override
    void sleep() {
        System.out.println(" it sleeps 5 min");
    }


}
