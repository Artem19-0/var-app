package by.itstep;

import java.util.Scanner;

public class Calculator {

    public static void printSumma(int a, int b) {

        System.out.println("S = " + (a + b));
    }

    public static void printX2(int a) {
        System.out.println("S = " + (a * 2));
    }


    public static int summa(int a, int b) {
        int result = a + b;
        //System.out.println("S = " + result);
        return result;
    }

    public static int sub(int a, int b) {
        return a - b;

    }

    public static int div(int a, int b) {
        return a * b;


    }

    public static double mult(double a, double b) throws IllegalAccessException {
        if (b == 0) {
            throw new IllegalAccessException("Div by sero");
        }
        return a / b;

    }

    public static int squareRoot(double base) {
        int result = (int) Math.sqrt(base);
        return result;
    }

    public static int car(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int math(int a, int b) {//метод который выведет гипотенузу
        int c = squareRoot((Math.pow(a, 2) + Math.pow(b, 2)));
        return c;
    }

    public static void menu() throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. summa");
        System.out.println("2. sub");
        System.out.println("3. div");
        System.out.println("4. mult");
        System.out.println("5. squareRoot");
        System.out.println("6. math");

        int methodNumber = sc.nextInt();
        switch (methodNumber) {
            case 1: {
                System.out.print("input a: ");
                int a = sc.nextInt();
                System.out.print("input b: ");
                int b = sc.nextInt();
                int r = summa(a, b);
                System.out.println("result is " + r);
                break;
            }
            case 2: {
                System.out.print("input a: ");
                int a = sc.nextInt();
                System.out.print("input b: ");
                int b = sc.nextInt();
                int r = sub(a, b);
                System.out.println("result is " + r);
                break;
            }
            case 3: {
                System.out.print("input a: ");
                int a = sc.nextInt();
                System.out.print("input b: ");
                int b = sc.nextInt();
                int r = div(a, b);
                System.out.println("result is " + r);
                break;
            }
            case 4: {
                System.out.print("input a: ");
                int a = sc.nextInt();
                System.out.print("input b: ");
                int b = sc.nextInt();
                double r = mult(a, b);
                System.out.println("result is " + r);
                break;
            }
            case 5: {
                System.out.print("input a: ");
                int a = sc.nextInt();
                double r = squareRoot(a);
                System.out.println("result is " + r);
                break;
            }
            case 6: {
                System.out.print("input a: ");
                int a = sc.nextInt();
                System.out.print("input b: ");
                int b = sc.nextInt();
                int r = math(a, b);
                System.out.println("result is " + r);
                break;
            }
            default: {
                System.out.println("нет такого номера, выберете из предложенных ");
                menu();
            }
            System.out.println("повторить ?");
            System.out.println("закончить ?");
            int methodNumber1 = sc.nextInt();
            switch (methodNumber1) {
                case 1: {
                    menu();
                }
                case 2: {
                    break;
                }

            }
        }}

        public static void randomMethod ( int times){
            if (times < 1) {
                System.out.println("Wrong times number!");
            } else {
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < times; i++) {
                    int mNum = (int) (Math.random() * 5) + 1;
                    switch (mNum) {
                        case 1: {
                            System.out.println("Input A:");
                            int a = sc.nextInt();
                            System.out.println("Input B:");
                            int b = sc.nextInt();
                            int r = summa(a, b);
                            System.out.println("Result is " + r);
                            break;
                        }
                        case 2: {
                            System.out.println("Input A:");
                            int a = sc.nextInt();
                            System.out.println("Input B:");
                            int b = sc.nextInt();
                            int r = sub(a, b);
                            System.out.println("Result is " + r);
                            break;
                        }
                        case 3: {
                            System.out.println("Input A:");
                            int a = sc.nextInt();
                            System.out.println("Input B:");
                            int b = sc.nextInt();
                            double r = div(a, b);
                            System.out.println("Result is " + r);
                            break;
                        }
                        case 4: {
                            System.out.println("Input Number:");
                            int a = sc.nextInt();
                            double r = squareRoot(a);
                            System.out.println("Result is " + r);
                            break;
                        }
                        default: {
                            System.out.println("Wrong method number!");
                        }
                    }
                }

            }
        }

        public static void main (String[]args) throws IllegalAccessException { //это клиент ,он запускаяет код
            printSumma(10, -90);
            printX2(200);

            int s = summa(5, 55);
            System.out.println(s);


            int r = sub(200, -100);
            System.out.println(r);

            int e = div(70, 10);
            System.out.println(e);

            double q = mult(5, 7);
            System.out.println(q);

            System.out.println(sub(sub(2, 2), summa(4, 4)));

            System.out.println(squareRoot(9));

            System.out.println(car(8, 8));


            int c = math(3, 4);
            System.out.println(c);
            menu();
        }



}