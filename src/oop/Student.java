package oop;

public class Student {

    private String name;
    private double avg;


    // has - a - relationship
    private University university; // можно сказать у студента есть университет



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }




    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}


class University{

    private String name;
    private String location;
    private int numberOfStudents;

    // has - a - relationship
    private Teacher [] teachers;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }



    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }


}
class Teacher{

    private String name;
    private int exp;
    private long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }



    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}

class Test{
    public static void main(String[] args) {

        Teacher teach1 = new Teacher();
        teach1.setName("Daim");
        teach1.setSalary(34235);
        teach1.setExp(7);

        Teacher teach2 = new Teacher();
        teach2.setName("Bob");
        teach2.setSalary(3000);
        teach2.setExp(10);


        Teacher [] teachers = {teach1 , teach2};


        University university = new University();
        university.setName("MGAK");
        university.setLocation("BLR , P.Brovki 66");
        university.setNumberOfStudents(1700);
        university.setTeachers(teachers);


        Student stud = new Student();
        stud.setName("Adam");
        stud.setAvg(3.5);
        stud.setUniversity(university);


    }
}