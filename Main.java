package lesson7;

import lesson7.quadrangle.Rectangle;
import lesson7.quadrangle.Rhombus;
import lesson7.quadrangle.Square;
import lesson7.triangle.Triangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle.toString());

        Square square = new Square(10);
        System.out.println(square.toString());

        Rhombus rhombus = new Rhombus(10, 60);
        System.out.println(rhombus.toString());

        Rectangle rectangle = new Rectangle(3, 2);
        System.out.println(rectangle.toString());

        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.toString());

        System.out.println(ShapeUtil.isQuadrangle(rhombus));
        System.out.println(ShapeUtil.isTriangle(triangle));

        System.out.println(triangle.isAreaEqual(rectangle));

    }


}
