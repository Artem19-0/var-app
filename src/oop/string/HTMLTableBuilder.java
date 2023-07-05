package oop.string;

import org.omg.CORBA.PUBLIC_MEMBER;

public class HTMLTableBuilder {

    public static final String TABLE_BEGIN = "<table>";
    public static final String TABLE_END = "</table>";

    public static final String TABLE_ROW_BEGIN = "<tr>";
    public static final String TABLE_ROW_END = "</tr>";

    public static final String TABLE_HEADER_BEGIN = "<th>";
    public static final String TABLE_HEADER_END = "</th>";

    public static final String TABLE_DATA_BEGIN = "<td>";
    public static final String TABLE_DATA_END = "</td>";





    private  StringBuilder htmlData = new StringBuilder(1000);// todo try to calculate capacity


    public HTMLTableBuilder() {
        htmlData.append(TABLE_BEGIN).append(TABLE_END);
    }

    

    public  String build(){
        return htmlData.toString();
    }


    public void addHeaders(String... headers ){

        StringBuilder headersBuilder = new StringBuilder(20 * headers.length);
        headersBuilder.append(TABLE_ROW_BEGIN);
        for(String header : headers){
            headersBuilder.append(TABLE_HEADER_BEGIN);
            headersBuilder.append(header);

            headersBuilder.append(TABLE_HEADER_END);
        }
        headersBuilder.append(TABLE_ROW_END);


        int pos = htmlData.indexOf(TABLE_BEGIN) + TABLE_BEGIN.length();

        htmlData.insert(pos,headersBuilder);
    }


    public void addStudents(Student... students){


    }


}
