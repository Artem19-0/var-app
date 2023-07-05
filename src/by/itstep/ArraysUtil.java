package by.itstep;

public class ArraysUtil {//массивы

    public static int [] getRandomArray(int maxSize){

     int size = MathUtil.random(maxSize);
     int [] arr = new int[size];
     for (int i = 0; i < arr.length; i++){
         arr[i] = MathUtil.random();
     }
     return arr;
    }




    public static int findMax (int [] array){
       int max = Integer.MIN_VALUE ;
       for(int index = 0 ; index < array.length; index++ ){
           if( max < array[index]){
               max = array[index];
           }
       }
        return max;
    }




    public static void printArray(int [] array){
        for(int index = 0 ; index < array.length; index++){
            System.out.println("Array [" + index + "] = "+ array[index] +"\n");


        }
    }





    public static void printArray( int [] array , boolean inLine){

        if(inLine) {
            System.out.print("arr ={");
            for (int index = 0; index < array.length; index++) {
                if (index == array.length - 1) {
                    System.out.print(array[index]);
                } else {
                    System.out.print(array[index] + " , ");
                }
            }

            System.out.println("}\n");
        }else {
            printArray(array);
        }
    }





    public static void main(String[] args) {





       int arr[] = {12, 22 , 1000, -88};
     int m = findMax(arr);
        System.out.println(m);





        //деклорация массивов


        //одноразмерные массивы
    int arr1[];
    int [] arr2;
    double [] dArr;
    boolean [] flags;

    //двумерные массивы
        int[][] arr3;
        int[] arr4[];//тоже самое
        int arr5[] [];

        //multiple массив
        int [][] arr6[];
        int []arr7 [][][][][][][];

        //интериализация массива


        //             0  1  2
        int arr10[] = {1, 2, 3};
        //              0   1    2    3
        int arr100[] = {30, 27, -13, 5346};

        //             0   1   2   3   4
        //            {0 , 0 , 0 , 0 ,0}
        int [] arr11 = new int[5];

        int [] arr110 = new int[500];

       //                0    1
        arr =new int [] {12 , 2};



        //size
        int arr100size = arr100.length; // вернет размерность массива

        System.out.println("Number of elements is " +  arr100size );
        System.out.println("Number of elements is " +   arr110.length);

        //get element from array
        int val = arr100[3];
        System.out.println("VALUE IS " + val);

        int val2 = arr110[499];
        System.out.println("VALUE IS " + val2);


        // index        0   1    2     3       4
        int array[] = {34 , 33 , 8 , -800 , Integer.MAX_VALUE};
        int index = 0;

        System.out.println("first element is " + array[index]);

        // last index
        int LastIndex = array.length - 1;
        System.out.println("second element is " + array[LastIndex]);

        int i = 1;
        System.out.println("Elem " + array[i]);

  //                    0    1    2    3     4     5
        int chars []= {'h','e', 'l' , 'l', 'o' , '!'};
        System.out.println(chars[chars.length - 1]);


        //set element from array

        int arr1000[] = new int [100];
        //<VAR NAME{INDEX] = VALVE;
        arr1000[0] = -100;
        arr1000 [1] = Integer.MIN_VALUE;
        arr1000 [99] = (int) (Math.random() *101);

        System.out.println("LAST elem is " + arr1000[arr1000.length -1]);


        int a [] = new int[5];
        a[0] = 22;
        a[1] = 123;
        a[2] = 10;
        a[3] = -99;
        a[4] = 8;

        int aCopy [] = new int [a.length + 3];
        aCopy[0] = a[0];
        aCopy[1] = a[1];
        aCopy[2] = a[2];
        aCopy[3] = a[3];
        aCopy[4] = a[4];
        aCopy [5] = a[0] + a[1] + a[2] + a[3] + a[4] ;
        aCopy [6] = a[0] * 100;
        aCopy [7] = aCopy.length;

        System.out.println(aCopy[0]);
        System.out.println(aCopy[1]);
        System.out.println(aCopy[2]);
        System.out.println(aCopy[3]);
        System.out.println(aCopy[4]);
        System.out.println(aCopy[5]);
        System.out.println(aCopy[6]);
        System.out.println(aCopy[7]);








    }
}
