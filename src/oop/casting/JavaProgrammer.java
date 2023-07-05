package oop.casting;

import com.sun.org.apache.bcel.internal.generic.NEW;

public abstract class JavaProgrammer {

    abstract void makeCod();

    public void playTennis(){
        System.out.println("playing tennis...");
    }




}
class MiddleJavaDeveloper extends JavaProgrammer{

    @Override
    void makeCod() {
        System.out.println("write some good cod here2.");
        playTennis();
    }

    void sleep(){
        System.out.println("he sleeps on the office");
    }


}
class SeniorJavaDeveloper extends JavaProgrammer{


    @Override
    void makeCod() {
        System.out.println("write some good project here3.");
        playTennis();
    }

    void leaveOffice(){
        System.out.println("leave from office");
    }

    void learn(){
        System.out.println("he learns");
    }
}

class JuniorJavaDeveloper extends JavaProgrammer{


    @Override
    void makeCod() {
        System.out.println("write some good project here4.");
        playTennis();
    }

    void leaveOffice(){
        System.out.println("leave from office");
    }

    void learn(){
        System.out.println("he learns");
    }
}


class Company{
    public static void main(String[] args) {
        JuniorJavaDeveloper junior = new JuniorJavaDeveloper();

        JavaProgrammer programmer = (JavaProgrammer) junior; //upcasting
//        int a = 5;
//        int b = (int) 5.056;
//        double c = (double) 5;
//        long d = 900000000000000000L;
//        int r = (int) d;



        Object o = (Object)new SeniorJavaDeveloper();
        Object o2 =(Object)(JavaProgrammer)new MiddleJavaDeveloper();


        JavaProgrammer jp = new JuniorJavaDeveloper(); // new SeniorJavaDeveloper();

        if(jp instanceof SeniorJavaDeveloper){
            SeniorJavaDeveloper sjd = (SeniorJavaDeveloper)jp;
            sjd.leaveOffice();
        } else if(jp.getClass() == JuniorJavaDeveloper.class) {
            JuniorJavaDeveloper jun = (JuniorJavaDeveloper) jp;
            jun.learn();
        }



        JavaProgrammer [] programmers = { junior , (JavaProgrammer) o, (JavaProgrammer) o2, jp};
        System.out.println("programmers : " + programmers.length );

        for(JavaProgrammer prog : programmers) {
            prog.makeCod();
        }












    }


}


