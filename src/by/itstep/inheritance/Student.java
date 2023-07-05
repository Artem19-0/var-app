package by.itstep.inheritance;

import sun.dc.pr.PRError;

public class Student extends Person{

    private double avg;
    private String food;

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }


    public Student (int id , String name , String last_name, char gender , double avg , String food){
        super(id,name , last_name, gender );
        this.avg = avg;
        this.food = food;

    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", last_name='" + getLast_name() + '\'' +
                ", gender = " + getGender() + "," + " средний балл " + avg + ',' + food +
                '}';
    }

}
