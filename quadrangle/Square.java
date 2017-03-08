package lesson7.quadrangle;

import lesson7.quadrangle.Quadrangle;

/**
 * Created by Артём on 08.03.2017.
 */
public class Square extends Quadrangle {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double firstDiagonalCalc() {
        return Math.sqrt(2*(Math.pow(side,2)));
    }

    @Override
    public double secondDiagonalCalc() {
        return super.secondDiagonalCalc();
    }

    @Override
    public double areaCalc() {
        return Math.pow(side,2);
    }

    @Override
    public String toString() {
        return "Квадрат со стороной "+side+" имеет площадь "+areaCalc()+" и диагональ "+firstDiagonalCalc();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
