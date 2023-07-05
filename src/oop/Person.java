package oop;

import java.util.Scanner;

//class <=> Model <=> Type <=> Template класс он же тип определяет
public class Person {

    //  field - поля. Характерисьтики будущего объекта
    int age;
    String name;
    String lastName;
    char gender; // can be 'f' , 'm'
    boolean isSingle;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    // поведение будущих объектов

    void sayMyName(){
        System.out.println("HELLO , my name is " + name);
    }




    void dance(){
        System.out.println(name + " is dancing ");
    }





    void drink(){
        if(age >= 18){
            System.out.println("Vine or beer");
        }else {
            System.out.println("water , only water ");
        }
    }




}



class Tester{
    public static void main(String[] args) {
        int num;

        //создание переменной типа Person
        Person person;

        //инициализация объекта(instance). С помощью оператора new создаем объект в памяти
        person = new Person();

        // мы заполняем или инициализируем
       person.name = "John";
       person.age = 23;
       person.isSingle = true;
       person.lastName = "Sina";
       person.gender = 'f';



        // object behavior  <=> methods invocation
        person.sayMyName();
        person.dance();
        person.drink();

        System.out.println("****************************");



        Person person1 = new Person();
        person1.name = "Bob";
        person1.age = 17;
        person1.isSingle = true;
        person1.lastName = "Sina";
        person1.gender = 'f';

        person1.sayMyName();
        person1.dance();
        person1.drink();

        System.out.println("****************************");


        Person person2 = new Person();

        person1.name = "M";
        person1.age = 23;
        person1.isSingle = true;
        person1.lastName = "Gina";
        person1.gender = 'f';

        person2.sayMyName();
        person2.dance();
        person2.drink();

    }
}
