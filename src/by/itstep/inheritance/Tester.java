package by.itstep.inheritance;

import oop.Cat;

public class Tester  {

    public static void main(String[] args) {
        //"USE" relationship
        Third th = new Third();
        th.setId(160);
        th.setName("Adam");
        th.setAge(17);
        th.setIq(100);

 //     "USE" relationship
        Cat cat = new Cat();
        th.setCat(cat);


        th.sayMyName();
        th.swim();
        th.jump();

        System.out.println(th.toString());
        System.out.println(cat.toString());
    }
}
