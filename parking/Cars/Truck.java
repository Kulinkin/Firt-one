package lesson10.parking.Cars;

/**
 * Created by Артём on 12.03.2017.
 */
public class Truck extends Car {

    private double carryingCapacity;

    public Truck(String brand, String model, int manufactureYear, String registrationMark, String color, double carryingCapacity) {
        super(brand, model, manufactureYear, registrationMark, color);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "carryingCapacity=" + carryingCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Truck truck = (Truck) o;

        return Double.compare(truck.carryingCapacity, carryingCapacity) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(carryingCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
