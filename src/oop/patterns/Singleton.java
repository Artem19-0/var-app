package oop.patterns;

import java.util.Date;

public class Singleton {


   private static Singleton singleton;
   private String value;



   private Singleton(){
       System.out.println(" new Instance created");
   }

   // lazy implementation(ленивая реилизация ) - создания экземпляра по первому требованию (то есть клиента(main)).
    public static Singleton getSingleton() {
       if(singleton == null){
           singleton = new Singleton();
           singleton.value = new Date().toString();
       }
        return singleton;
    }



    public String getValue() {
        return value;
    }







}
class SingletonTester{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);
        System.out.println(singleton.getValue());


        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2);
        System.out.println(singleton2.getValue());

        Singleton singleton3 = Singleton.getSingleton();
        System.out.println(singleton3);
        System.out.println(singleton3.getValue());
    }
}