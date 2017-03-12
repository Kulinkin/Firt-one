package lesson10.parking.Cars;

/**
 * Created by Артём on 12.03.2017.
 */
public class Crossover extends Car {

    private String driveUnit;

    public Crossover(String brand, String model, int manufactureYear, String registrationMark, String color, String driveUnit) {
        super(brand, model, manufactureYear, registrationMark, color);
        this.driveUnit = driveUnit;
    }

    public String getDriveUnit() {
        return driveUnit;
    }

    @Override
    public String toString() {
        return "Crossover{" +
                "driveUnit='" + driveUnit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Crossover crossover = (Crossover) o;

        return driveUnit != null ? driveUnit.equals(crossover.driveUnit) : crossover.driveUnit == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (driveUnit != null ? driveUnit.hashCode() : 0);
        return result;
    }
}
