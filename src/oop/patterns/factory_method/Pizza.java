package oop.patterns.factory_method;

public abstract class Pizza {

    public abstract void printInfo();

}

class Margarita extends Pizza{

    @Override
    public void printInfo() {
        System.out.println(" маргаритта");
    }

}

class Piperonnie extends Pizza{

    @Override
    public void printInfo() {
        System.out.println("пеперонни");
    }
}

class Pizzeria {
    public static Pizza maKePizza(int key){
        if(key == 1){
            return new Margarita();
        }else if (key == 2){
            return new Piperonnie();
        }else if(key == 3){

        }
        throw new IllegalArgumentException("нет такой пиццы");
    }
}

class PizzaClient{
    public static void main(String[] args) {
       Pizza pizza = Pizzeria.maKePizza(1);
        pizza.printInfo();

        Pizza[] arraysPizzas = {Pizzeria.maKePizza(1)  , Pizzeria.maKePizza(2) , Pizzeria.maKePizza(1)};

    }
}