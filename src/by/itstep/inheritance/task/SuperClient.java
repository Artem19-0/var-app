package by.itstep.inheritance.task;

public class SuperClient extends Client{

     private String functions;



    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions;
    }


    public SuperClient(){
        
      // или  super(0 , null, null , null , null , "Админ");
        this.setRole("Админ");
    }


}
