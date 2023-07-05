package by.itstep.inheritance;

public class Third extends Child {

    private long id;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public void swim(){
        System.out.println(getName() + " swimming ");
    }

}
