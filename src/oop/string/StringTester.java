package oop.string;

import java.util.Locale;

public class StringTester {
    public static void main(String[] args) {
        //String creation
        String str1 = "ABC";


        String str2 = new String("ABC");
        String str3 = new String();


        char[] chars = { 'h' , 'e' , 'l', 'l' , 'o'};
        String str4 = new String(chars);
        System.out.println(str4);


        String str5 = new String(chars , 1 ,3 ); // печатает 3 буквы начиная с 1-го элемента
        System.out.println(str5);


//        String g = new String(chars , 0 , chars.length); печатает все буквы начиная с 0 элемента
//        System.out.println(g);

                                  //     01234
        String str6 = new String("This is String"); // пробел тоже элемент

        int code =(int) 't';
        System.out.println(code);

       int first =  str6.indexOf(code);
        System.out.println("'x' : " + first);


       int size =  str6.length();
        System.out.println("String size is " + size);


       String str7 =  str6.toLowerCase();
       //str6.toUpperCase();
        System.out.println(str6);
        System.out.println(str7);


        String str8 = "        TEXT JAVA 19,JAVA 18,JAVA 17        ";
        str8 = str8.trim(); //удаляет пробелы , но не между слов и цифр
        System.out.println(str8);


        int index = str8.indexOf('9');
        System.out.println(index);


        int index2 = str8.indexOf("JAVA");
        System.out.println(index2);


        int index3 = str8.lastIndexOf("JAVA");
        System.out.println(index3);// считает номера элементов до слова 'JAVA'

                                         //        С этого элемента она исчит '1'
        int index4 = str8.indexOf("1", 12);
        System.out.println(index4); // скажет номер '1'





        String text = "Search the world's information, including webpages, images, videos and more." +
                "Google has many special features to help you find exactly what you're looking for.";

       boolean isContains = text.contains("images");
        System.out.println(isContains);



        boolean isContains2 = text.indexOf("images") != -1 ;
        System.out.println(isContains2);



        boolean isContains3 = text.indexOf("Images") != -1;
        System.out.println(isContains3);


       char ch = (char) text.codePointAt(12);
        System.out.println(ch); // покажет букву под номером индекса 12



        text.codePointCount(10,20);

        int result = text.compareTo("Test compareTo");// мы будем сравнивать текс из text и с текстом из скобок
        System.out.println(result);



        text = text.concat("https://www.google.com/66&ome&-8"); //склеивает символы в скобках с text
        System.out.println(text);



       boolean isEq1 = text.equals("HOOOOOO");//сравнивает 2 строки , аналог
        System.out.println(isEq1);

        boolean isEq2 = text.equals(new String(text));
        System.out.println(isEq2);




        text.endsWith("!");

        System.out.println(text.startsWith("S"));


        text = text.replace("Google" , "Yandex");//заменяет символы
        text = text.replace("google" , "yandex");
        System.out.println(text);



        text.trim().isEmpty();


        char [] arr = text.toCharArray();
        for(int i = 0 ; i < arr.length ; i +=2){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0 ; i < text.length() ; i +=3){
            System.out.print(text.charAt(i) + " ");
        }



        //
        String s1 = "AAA";
        String s2 = "AAA";
        int result2 = s1.compareTo(s2); // compareToIgnoreCase будет игнорировать проберы
        System.out.println(result2);

        boolean isEqual = result2 == 0;
        System.out.println("IS Equal " + isEqual);













    }
}
