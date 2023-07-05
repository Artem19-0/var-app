package oop.string;

public class MutableStrings {
    public static void main(String[] args) {

        StringBuffer sBuff; //безопасный но не быстрый
        StringBuilder sBuilder; //наобарот


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ");//склеивает
        String str = null;
        stringBuilder.append(str).append('x').append(333);//можно цепочкой
        System.out.println(stringBuilder.toString());


        StringBuilder sBuilder2 = new StringBuilder(500);
        sBuilder2.append("Hello world!");
        sBuilder2.append("Hello world!");
        sBuilder2.append("Hello world!");
        System.out.println(sBuilder2);



        StringBuilder sBuilder3 = new StringBuilder("500");

        StringBuilder sBuilder4 = new StringBuilder(stringBuilder.append(sBuilder2));
        System.out.println(sBuilder4);

        System.out.println(sBuilder4.reverse());//меняет символы зеркально

        System.out.println("capacity " + sBuilder4.capacity());
        System.out.println("length " + sBuilder4.length());
        System.out.println("free " + (sBuilder4.capacity() - sBuilder4.length()));

        String words [] = sBuilder4.toString().split(" ");
        for ( String word : words){
            System.out.println(word);
        }









        HTMLTableBuilder htmlTableBuilder = new HTMLTableBuilder();
        htmlTableBuilder.addHeaders("ID" , "NAME" , "AVG");

        htmlTableBuilder.addStudents(new Student());


        System.out.println(htmlTableBuilder.build());








    }
}
