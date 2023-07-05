package by.itstep;

public class Archi {

    public static void main(String[] args) {

        System.out.println("Begin");
        //if(<condition>) {<body>} , where condition can be TRUE or FALSE!
        //IF CONDITION true тогда выполняется body
        int t = -30;
        if (t > 20) {
            System.out.println("Майка");
        }

        if (t < -15) {
            System.out.println("Шуба");
        }

        int m1 = 10, m2 = 10, m3 = 10, m4 = 10, m5 = 10;
        double avg = (m1 + m2 + m3 + m4 + m5) / 5.0;
        System.out.println("AVG: " + avg);

        if (avg >= 9) {
            System.out.println("=)");
        } else if (avg >= 6) {
            System.out.println("=|");
        } else {
            System.out.println("=(");
        }


        int a = 7, b = 5 ,c = 3;


        if((a + b) <= c){
            System.out.println("Invalid triangle");
        } else if((a + c) <= b){
            System.out.println("Invalid triangle");
        }  else if((b + c) <= a) {
            System.out.println("Invalid triangle");
        } else {
            System.out.println("Correct triangle");
        }




        int s = 9 , d = 4;
        if(s >=d){
            System.out.println("Число больше");
        } else if (s <=d){
            System.out.println("Число меньше");
        } else {
            System.out.println("Число равно");
        }




        int q = 4, w = 6, e = 1;
        if((q+w) <= e){
            System.out.println("Correct");
        }else if((w+e) >= q){
           System.out.println("Not correct");
        }else if((e+q) >=w){
            System.out.println("=");
        }









        System.out.println("End");

    }


}
