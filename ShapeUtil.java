package lesson7;

import lesson7.quadrangle.Quadrangle;
import lesson7.quadrangle.Rectangle;
import lesson7.triangle.Triangle;

/**
 * Created by Артём on 08.03.2017.
 */
public class ShapeUtil {

    public static boolean isQuadrangle(Figure figure) {
        return figure instanceof Quadrangle;
    }

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure) {
        return (figure instanceof Triangle);
    }
}

