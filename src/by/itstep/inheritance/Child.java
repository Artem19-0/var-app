package by.itstep.inheritance;

import oop.Cat;

public class Child extends Perent { // класс child расширяет класс (наследует) perent
    //"IS -A" relationship == когда наследник есть родитель



     private Cat cat;// "HAS - A " relationship

     private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }



    public void jump(){
        System.out.println("jumping " + getName() );
    }



    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }



   @Override
    public void sayMyName() { // переопределение , способность изменить функционал который был в базовом классе

        super.sayMyName();//это ссылка на супер-класс
        System.out.println("My name is " + getName());
    }


}
