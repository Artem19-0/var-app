package oop;

import by.itstep.MathUtil;
import lombok.Data;


@Data       //это интерфейс
public class Car {

    String color ;
    String model;
    int mileage;
    boolean isNotBrake;

    int hp;
    int numberOfSears;

    int currentGear;
    int numberOfGears;

    int maxSpeed;
    int currentSpeed;



    void acceleration() throws InterruptedException {
        while (currentSpeed <= maxSpeed){
            switchGearUp();
            Thread.sleep(500);
           int temp = MathUtil.random(10,40);
           currentSpeed += temp;
            System.out.println("Current speed is " + currentSpeed);
        }
    }


    void switchGearUp() {
        if (numberOfGears > currentGear) {
            currentGear++;
            System.out.println("Current gear up " + currentGear);
        } else {
            System.out.println("max gear number is reached");
        }
    }


    void switchGearDown(){
        if(numberOfGears > currentGear) {
            currentGear--;
            System.out.println("Current gear up " + currentGear);
        }else {
            System.out.println("min gear number is reached");
        }
    }
}





class Taster{
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();

        car.color = "Green";
        car.model = "BMW";
        car.numberOfGears = 6;
        car.maxSpeed = 280;
        car.currentSpeed = 0;
        car.currentGear = 0;

        car.acceleration();







    }
}