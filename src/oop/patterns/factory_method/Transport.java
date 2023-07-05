package oop.patterns.factory_method;

public abstract class Transport {

    public abstract void deliver();


}



class Plane extends Transport{

    @Override
    public void deliver() {
        System.out.println("доставка по воздуху");
    }

}


class Truck extends Transport{

    @Override
    public void deliver() {
        System.out.println("доставка по земле");
    }
}


class Ship extends Transport{

    @Override
    public void deliver() {
        System.out.println("доставка по воде");
    }
}
class FactoryMethodPattern{
    public static Transport getTransport(String type){
        switch(type){
            case "Plane" :
                return new Plane();
            case "Truck" :
                return new Truck();
            case "Ship" :
                return new Ship();
            default:
              throw new IllegalArgumentException("no such delivery type:");
        }
    }



    public static Transport getTransport(int key){
        switch(key){
            case 1 :
                return new Plane();
            case 2 :
                return new Truck();
            case 3 :
                return new Ship();
            default:
                throw new IllegalArgumentException("нет такого типа доставки:");
        }
    }

}



class Client{
    public static void main(String[] args) {
       Transport t1 = FactoryMethodPattern.getTransport("Plane");
       t1.deliver();

        Transport t2 = FactoryMethodPattern.getTransport(3);
        t2.deliver();
    }
}
