package lesson7;

/**
 * Created by Артём on 08.03.2017.
 */
public abstract class Figure implements Area {

    public abstract String toString ();

    public boolean isAreaEqual(Figure firstFigure){
        return (firstFigure.areaCalc()== this.areaCalc());
    }
}

