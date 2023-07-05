package oop.model;

public class CoffeeMachine {
    private final double maxWaterTank = 1000;
    private final double maxCoffeeTank = 1000;
    private final double maxGarbageTank = 1500;


    private static int salesCounter = 0;
    private String model;
    private int numberOfCups;


    private double waterTank;
    private double coffeeTank;
    private double garbageTank;
    private double milkTank;


    private int currentWaterTemp;

    private boolean isActive = false;
    private boolean isOn = false;



    public void addWater(int extraWater) {
        if ((extraWater + waterTank) >= maxWaterTank){
            System.out.println("can't add water ");
        }else {
            waterTank = waterTank + extraWater;
            System.out.println("current water: " + waterTank + "(ml)");
        }
    }



    public void addCoffee(int extraCoffee) {
        if ((extraCoffee + coffeeTank) >= maxCoffeeTank){
            System.out.println("can't add coffee ");
        }else {
            coffeeTank = coffeeTank + extraCoffee;
            System.out.println("current coffee: " + coffeeTank + "(g)");
        }
    }



    public void maxGarbage(int extraGarbage) {
        if ((extraGarbage + garbageTank) >= maxGarbageTank){
            System.out.println("can't safe garbage ");
        }else {
            garbageTank = garbageTank + extraGarbage;
            System.out.println("current garbage: " + garbageTank + "(g)");
        }
    }





    public CoffeeMachine(String model){
        salesCounter ++;
        this.model = model;
        this.numberOfCups = 0;
    }


    public void switchOn() throws InterruptedException {
        if(!isOn) {
            System.out.println("кофе машина " + model + " начинает работать");
            Thread.sleep(1000);
            isOn = true;
            System.out.println("кофе машина " + model + " работала");
        }else {
            System.out.println("Already started");
        }
    }


    public void switchOff() throws InterruptedException {
        if(isOn) {
            System.out.println("кофе машина " + model + " заканчивает работать");
            Thread.sleep(1000);
            isOn = false;
            System.out.println("кофе машина " + model + " закончила работать ");
        }else {
            System.out.println("Already stopped");
        }
    }



    public void makeСappuchino(){// надо подругому
        if(waterTank >= 500 && coffeeTank >= 200 && garbageTank <1000 ) {
            System.out.println("");
        }else {
            System.out.println("make cappuchino");
        }
    }









}
