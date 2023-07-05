package by.itstep;

import java.util.Scanner;

public class SwitchTester {
    public static void main(String[] args){
        int a = 1;
        // switch (var) {body with cases}


        switch (a) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default :
                System.out.println("not one and not two!");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("num day:");
        int b = sc.nextInt();

        switch(b){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("W");
                break;
            case 4:
                System.out.println("TH");
                break;
            case 5:
                System.out.println("F");
                break;
            case 6:
                System.out.println("THA");
                break;
            case 7:
                System.out.println("g");
            default:
                System.out.println("not day");
        }


        main3();
    }







    public static void main2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Num Month");
        int Num_Month = sc.nextInt();
        switch(Num_Month){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
        }

    }

    public static void main3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input latter (single):");
        char ch = sc.next().charAt(0);
        int code = (int)ch; //получаем код символа
        System.out.println("Code is " + code);
        if ((code >= 65 && code<= 90) || (code >= 97 && code <= 122)){
            System.out.print("Latter: ");
            switch(ch){
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'i':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'I':
                    System.out.println("vowels");
                    break;
                default:
                    System.out.println("consonant");
                    break;
            }


        }else{
            System.out.println("not letter");
        }


    }










}
