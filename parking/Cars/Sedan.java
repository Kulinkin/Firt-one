package lesson10.parking.Cars;

/**
 * Created by Артём on 12.03.2017.
 */
public class Sedan extends Car {

    private double engineCapacity;

    public Sedan(String brand, String model, int manufactureYear, String registrationMark, String color, double engineCapacity) {
        super(brand, model, manufactureYear, registrationMark, color);
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Sedan sedan = (Sedan) o;

        return Double.compare(sedan.engineCapacity, engineCapacity) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(engineCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
