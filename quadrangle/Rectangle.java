package lesson7.quadrangle;

/**
 * Created by Артём on 08.03.2017.
 */
public class Rectangle extends Quadrangle{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double firstDiagonalCalc() {
        return Math.sqrt(Math.pow(sideA,2)+Math.pow(sideB,2));
    }

    @Override
    public double secondDiagonalCalc() {
        return super.secondDiagonalCalc();
    }

    @Override
    public double areaCalc() {
        return sideA*sideB;
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник со сторонами %.1f и %.1f имеет диагональ %.1f и площадь %.1f", sideA, sideB, firstDiagonalCalc(), areaCalc());
    }
}
