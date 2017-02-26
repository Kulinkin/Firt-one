package Lesson6;

/**
 * Created by Артём on 26.02.2017.
 */
public class Rectangle {
    private Point upperLeft;
    private Point bottomRight;

    public Rectangle(Point upperLeft, Point bottomRight) {
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    public double areaCalc() {
        double x = this.bottomRight.getX() - this.upperLeft.getX();
        double y = this.upperLeft.getY() - this.bottomRight.getY();
        return x * y;
    }

    public double diagonalCalc() {
        return this.upperLeft.distance(this.bottomRight, this.upperLeft);
    }
}
