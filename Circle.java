package lesson7;

import com.sun.corba.se.impl.interceptors.PICurrent;

/**
 * Created by Артём on 08.03.2017.
 */
public class Circle extends Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalc() {
        return (Math.pow(radius,2)* Math.PI);
    }

    @Override
    public String toString() {
        return ("Круг с радиусом  "+radius+ " имеет площадь "+areaCalc());
    }
}
