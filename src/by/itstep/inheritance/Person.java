package by.itstep.inheritance;

public class Person {

    private int id;
    private String name ;
    private String last_name;
    private char gender;



    public Person(){
        //вызов существующего конструктора в это классе.
        // Вызов конструктора должен быт в первом line
        this(0,"Stranger");  //конструктор - единственный и возможный способ java создать объект


    }//  конструктор никогда ничего не возвращают



//  конструктор который будет инициализироват поля
    public Person(int id , String name , String last_name, char gender){
        System.out.println("Person + 1");
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.gender = gender;

    }

    public Person(int id , String name){
       this(id , name , null , ' ');
    }














    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }




    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Person p = new Person();
        p.setId(234);
        p.setGender('m');
        p.setName("Bob");
        p.setLast_name("Sina");
         System.out.println(p.toString());


        Person p2 = new Person();
         System.out.println(p2.toString());


         Person p3 = new Person(55,"Nick","Tyson", 'm'); // это удобнее чем писать как в  line
          System.out.println(p3);


        Person p4 = new Person(444,"Mike");
         p4.setGender('m'); //усли кто-то потом сказал фамилию , мы можем добавить её
          System.out.println(p4);




        Employee e = new Employee();
        e.setId(234);
        e.setName("John");
        e.setLast_name("Johnson");
        e.setGender('m');
        e.setSalary(2524);
        System.out.println(e);

        Employee e3 = new Employee(2134, "Alex " , "Ivanov" , 'm' , 342);
        System.out.println(e3);



        Student s = new Student(342,"Петя", "Петров ", 'm' , 9.9 , "Студент кушает даширак" );
        System.out.println(s);

    }


}