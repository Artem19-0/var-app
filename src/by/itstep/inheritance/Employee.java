package by.itstep.inheritance;

public class Employee extends Person{

    private long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    // прежде всего запускаеться конструктор родительского(базового) класса
    // дабы обеспечить инизиализацию
    public Employee(){
    // явный вызов родительского конструктора ,если этого не написать вызов произойдёт не явным способом
        super();
    }

    public Employee(int id , String name, String lastName){
        //вызов супер-конструктора с параметр. Канструктор должен существовать

        super(id, null );
        this.setLast_name(lastName);


    }

    public Employee(int id , String name, String lastName , char gender , long salary){


        super(id,name , lastName , gender);
        this.salary = salary;


    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", last_name='" + getLast_name() + '\'' +
                ", gender=" + getGender() + "," + " salary " + getSalary() +
                '}' + "\n";
    }
}
