package lesson7.triangle;

import lesson7.Figure;

public class Triangle extends Figure implements Height,HalfPerimeter{

    protected double sideAB;
    protected double sideBC;
    protected double sideCA;

    @Override
    public double halfPerimeter() {
        return (sideAB+ sideBC+ sideCA)/2;
    }

    @Override
    public double areaCalc() {
        return Math.sqrt(halfPerimeter()*(halfPerimeter()-sideAB)*(halfPerimeter()- sideBC)*(halfPerimeter()- sideCA));
    }

    @Override
    public double heightFromPointA() {
        return areaCalc()*2/sideBC;
    }

    @Override
    public double heightFromPointB() {
        return areaCalc()*2/sideCA;
    }

    @Override
    public double heightFromPointC() {
        return areaCalc()*2/sideAB;
    }

    @Override
    public String toString() {
        return String.format("Треугольник со сторонами %.1f, %.1f, %.1f имеет площадь %.1f и высоты %.1f, %.1f, %.1f",
                sideAB, sideBC, sideCA, areaCalc(), heightFromPointA(), heightFromPointB(), heightFromPointC());
    }

    public Triangle(double sideAB, double sideB, double sideC) {
        this.sideAB = sideAB;
        this.sideBC = sideB;
        this.sideCA = sideC;
    }

    public double getSideAB() {
        return sideAB;
    }

    public double getSideBC() {
        return sideBC;
    }

    public double getSideCA() {
        return sideCA;
    }
}
