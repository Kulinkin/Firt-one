package lesson7.quadrangle;

/**
 * Created by Артём on 08.03.2017.
 */
public class Rhombus extends Quadrangle{

    private double side;
    private double angle;

    public Rhombus(double side, double angle) {
        this.side = side;
        this.angle = angle;
    }

    @Override
    public double firstDiagonalCalc() {
        return 2*Math.sin(Math.toRadians(angle/2))*side;
    }

    @Override
    public double secondDiagonalCalc() {
        return 2*Math.cos(Math.toRadians(angle/2))*side;
    }

    @Override
    public double areaCalc() {
        return Math.sin(Math.toRadians(angle))*Math.pow(side,2);
    }

    @Override
    public String toString() {
        return String.format("Ромб со стороной %.2f и углом %.2f имеет диагонали %.1f %.1f и площадь %.1f", side, angle, firstDiagonalCalc(), secondDiagonalCalc(), areaCalc());
    }

    public double getSide() {
        return side;
    }

    public double getAngle() {
        return angle;
    }
}
