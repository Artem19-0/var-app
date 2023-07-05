package oop.string;

public class Student {


    private int id;
    private String name;
    private String lastName;
    private int courseCount;
    private int avg;

    public Student() {

    }

    public Student(int id, String name, String lastName, int courseCount, int avg) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.courseCount = courseCount;
        this.avg = avg;
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




    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public int getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(int courseCount) {
        this.courseCount = courseCount;
    }




    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }
}
