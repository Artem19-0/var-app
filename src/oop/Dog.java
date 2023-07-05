package oop;

public class Dog {

    private long id;
    private String name;
    private String type;
    private char gender;
    private int age;
    private double w;
    private double h;




    //getters && setters это методы для получения поля(field)


    public String getName(){
        return name;
    }


    public void setName(String newName){
        name = newName;
    }




    public int getAge(){
        return age;
    }



    public void setAge(int newAge){
        if(newAge < 0){
            System.out.println("Incorrect age :" + newAge);
        }else {
            age = newAge;
        }
    }



    public char getGen(){
      return gender;
    }

    public void setGen(char gen){
      gender = gen;
    }





}

class DogTester{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Barsik");
        System.out.println("Name is " + dog.getName());




        dog.setAge(-2);
        System.out.println("Age is " + dog.getAge());


        dog.setGen('f');
        char q = dog.getGen();
        System.out.println(q);
        System.out.println(dog.getGen());
    }
}