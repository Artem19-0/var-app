package oop.patterns.factory_method;

public abstract class Logistics {


    abstract void planeDelivery();
    abstract Transport createTransport();



}



class SeaLogistics extends Logistics{

    @Override
    void planeDelivery() {
        System.out.println("Sea Delivery plan");
    }

    @Override
    Transport createTransport() {
        return new Ship();
    }
}


class FlyLogistics extends Logistics {

    @Override
    void planeDelivery() {
        System.out.println("Fly Delivery plan");
    }

    @Override
    Transport createTransport() {
        return new Plane();
    }
}




class RoadLogistics extends Logistics {

    @Override
    void planeDelivery() {
        System.out.println("Road Delivery plan");
    }

    @Override
    Transport createTransport() {
        return new Truck();
    }
}




class LogisticsProvider{
    public static Logistics chooseLogistics(String type){
        switch (type ){
            case "AIR":
                return new FlyLogistics();
            case "SEA":
                return new SeaLogistics();
            case "ROAD":
                return new RoadLogistics();
            default:
                System.out.println("нет такого типа: " + type);
                return new RoadLogistics();
        }
    }
}





class LogisticsClient{
    public static void main(String[] args) {
        Logistics l = LogisticsProvider.chooseLogistics("r");
        l.createTransport();
        l.planeDelivery();
    }
}