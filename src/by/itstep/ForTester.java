package by.itstep;

public class ForTester {
    public static void task() {
        for (int i = 0; i <2000; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }



    public static void task1() { // 1 3 5 7 ...(500 times)
        for (int i = 1; i <1000; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }



    public static void task2() { // 10 20 30 ...(10 times)
        for (int i = 0, number = 10; i < 50; i ++) {
            System.out.print(number + " ");
            number = number + 10;

        }
        System.out.println();
    }



    public static void task3() { //-1 -2 -3 -4 ...(100 times)
        for (int i = 0, number = -1;  i > -100; i --) {
            System.out.print(i + " ");
            number = number -1;
        }
        System.out.println();
    }




    public static void task4() { //-1 2 -3 4 -5 ...(100 times)
        for (int i = 0, number = -1;  i < 100; i ++) {

            if (number % 2 == 0) {// для всех четных чисел
                System.out.print(((-1) * number) + " ");
            }else{

                System.out.print(number + " ");
            }
            number--;
        }
        System.out.println();
    }


    public static void task5(){   //2 7 2 8 3 6 ... (25 times) (from 0 to 10)
        for (int i = 0, x ;  i < 25; i ++){
            x =(int) (Math.random() *11);
            System.out.print(x + " ");
        }
        System.out.println();
    }





    public static void task6(){  //таблица умножения
        for (int i = 2, x =2 ;  x <= 10; x ++){ // or x=11
            int r = i * x;
            System.out.println(i + "x" +x + "=" + r);
        }
        System.out.println("****");
        for (int i = 3, x =2 ;  x <= 10; x ++){ // or x=11
            int r = i * x;
            System.out.println(i + "x" +x + "=" + r);
        }
        for (int i = 4, x =2 ;  x <= 10; x ++){ // or x=11
            int r = i * x;
            System.out.println(i + "x" +x + "=" + r);
        }
        System.out.println("*****");
    }




    public static void task7(){  //таблица умножения

        for (int a = 2; a <=9; a++) {
            for (int b = 2; b <= 10; b++){
                int result = a * b;
                System.out.println(a + "x" + b + "=" + result);
            }

        }
        System.out.println("*****");
        }







        public static void task8(){
        for ( int i = 0; i < 9; i++) {
            int studentNumber = ((int) (Math.random() * 12)) + 1;
            System.out.println(studentNumber);
        }
     }



        //    0           1             3            2
        //for(<var>; <condition> ; <iteration>) {<body>}
        //<var> - выполняеьться всего один раз
        //<condition> - правда или лож
        // <iteration> - оно выполняеться после тела или перед проверкой условия

        public static void main(String[] args){

        //%
            int num = 3;
            int num2 = 2;

            int result = num % num2;
            System.out.println(result);









            task();
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
            task8();


        }

}
