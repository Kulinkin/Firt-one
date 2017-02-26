package Lesson6;

/**
 * Created by Артём on 26.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        Point upperLeft = new Point(4, 16);
        Point bottomRight = new Point(7, 12);
        Point d = new Point(16,21);

        Rectangle rectangle = new Rectangle(upperLeft, bottomRight);

        System.out.println("Площадь: " + rectangle.areaCalc());
        System.out.println("Длина диагонали: " + rectangle.diagonalCalc());
        System.out.println("Расстояние от т.D до т.upperLeft : "+ d.distance(upperLeft,d));
    }
}
