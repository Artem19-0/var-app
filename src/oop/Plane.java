package oop;

public class Plane {

    private String namePlaner;
    private String idName;
    private int maxKl;
    private String letsFly;


    public String getNamePlaner(){
        return namePlaner;
    }

    public void setNamePlaner(String name){
        namePlaner = name;
    }




    public String getIdName(){
        return idName;
    }

    public void setIdName(String name) {
        idName = name;
    }




    public int getMaxKl(){
        return maxKl;
    }

    public void setMaxKl(int kl){
        maxKl = kl;
    }



    public void information (){
        System.out.println(namePlaner + " пилот самолёта " + idName);

    }


    public String getLetsFly(){
        return letsFly;
    }

    public void setLetsFly(String fly){
        letsFly = fly;
    }



}
class PlaneTester{
    public static void main(String[] args) {
     Plane plane = new Plane();

     plane.setNamePlaner("Bob");
        System.out.println("Name planer is " + plane.getNamePlaner());



     plane.setIdName("BOING-747");
        System.out.println("ID name of plane is " + plane.getIdName());


     plane.setMaxKl(2000);
        System.out.println("Самолёт может пролететь " + plane.getMaxKl() + " километров за один рейс");

        plane.information();



     plane.setLetsFly("полетел");
        System.out.println(plane.getNamePlaner() + " сел за штурвал и самолёт " + plane.getLetsFly());

    }
}