package oop;

public class Cat {


    private long id;
    private String name;
    private char gen;
    private boolean hasOwner;
    private String color ;
    private int iq;


    public int getIq(){
        return iq;
    }

    public void setIq(int iq1){
        iq = iq1;
    }




    public String getColor(){
        return color;
    }

    public void setColor (String color1){
        color = color1;
    }




    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }






    public boolean isHasOwner(){
        return hasOwner;
    }

    public void setHasOwner  (boolean newHasOwner){

        hasOwner = newHasOwner;
    }




    public char getGen(){
        return gen;
    }

    public void setGen(char gender){
        gen = gender;
    }





    public void play(){
        System.out.println(name + " is playing now");
    }

    public void sleep(){
        System.out.println(name + " is sleeping now");
    }









}
class CatTester{
    public static void main(String[] args) {
      Cat cat = new Cat();

      cat.setName("Mota");
        System.out.println("Name cat is " + cat.getName());


        cat.setColor("Black");
        System.out.println("Cat`s color is " + cat.getColor());


        cat.setIq(77);
        System.out.println("IQ of cat is " + cat.getIq());

        cat.play();


        cat.setGen('m');
        System.out.println("Gender cat is " + cat.getGen());



        cat.setHasOwner(true);
        System.out.println(cat.isHasOwner());
    }
}