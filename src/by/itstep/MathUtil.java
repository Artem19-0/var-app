package by.itstep;

import com.sun.javaws.jnl.PackageDesc;

public class MathUtil {


    public static void varTester(double val){
        double d;
        d = val;
        System.out.println(d);
        d = d + d;
        System.out.println(d);


    }

    public static void forTester(int num , double val, boolean flag ){
        System.out.println("for tester begin");
         for (int i = 0; i<num; i++) {
             if (flag) {
               System.out.println(val+= val);
             }else {
               System.out.println("fuck");
             }
         }


        System.out.println("for tester end");
    }



    /**
     * Returns a integer value with a positive sign, greater than or equal to 0 and less or equal than Max Bound.
     * @param maxBound
     * @return  a pseudorandom integer from 0 to maxBound inclusive
     */
    public static int random(int maxBound){ //усли метод 100 то от 0 до 100
        int x =(int) (Math.random() * (maxBound + 1));


        return x; //или return random(0 , maxBound) использует несколько методов
    }





    public static int random(int minBound ,int maxBound ){
        // TODO: case when maxBound less than minBound
        int v = maxBound - minBound + 1;

        int x =(int) (Math.random() * v) + minBound;

        return x;
    }





    public static int random( ){

        int x = random(10);
        return x;
    }










    public static void main(String[] args) {
        System.out.println("main starter");
//        varTester(5.55);
//        System.out.println("main end");

//        forTester(2,100,true);


//        int val = random(2);
//        System.out.println(val);
//
//           int val2 = random(100,101);
//           System.out.println(val2);



//        int x = random();
//        System.out.println(x);

        int []res = ArraysUtil.getRandomArray(20);
        ArraysUtil.printArray(res, true);


        int max = ArraysUtil.findMax(res);
        System.out.println(max);


    }
}
