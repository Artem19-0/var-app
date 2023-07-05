package oop.casting;

public class ShapeTester {

    public static void shapeTest(Shape shape){
        shape.calculateS();
        shape.calculateP();
        shape.shoInfo();
        shape.print();


    }







    public static void main(String[] args) {
        Triangle t1 = new Triangle(11,6,9);
        t1.setColor("Purple");
        t1.calculateS();
        t1.calculateP();
        t1.print();
        t1.shoInfo();

        Rectangle r1 = new Rectangle(4,13);
        r1.print();
        r1.calculateP();
        r1.calculateS();
        r1.shoInfo();
        Rectangle r2 = new Rectangle(8); // Rectangle r2 = new Rectangle(8 , 8);



        //кастинг(casting) или приведение типов
        // кастинг не меняет поля , он ничего не делат с объектом


        //Upcasting - то когда мы конкретный объект расматриваем смотрим на него общий ссылкой родитнльского класса
       // тем самым функционал конкретного класса становится не доступен
        Shape sh1 = new Triangle(11,66,44);

        // (< super type>) instance
        Shape sh2 = (Shape) new Rectangle(54);


        //DownCasting = то процесс когда мы получаем из более общего в более конкретный
        Shape sh3 = new Triangle(5,5,5);

        Triangle t2 = (Triangle) sh3; // всегда в явной форме
        t2.setC(9);


        Rectangle rectangle = new Rectangle(7);
        Triangle triangle = new Triangle(4,5,8);

        shapeTest(rectangle);
        shapeTest(triangle);
    }


}
