package lesson10.parking.Cars;

/**
 * Created by Артём on 12.03.2017.
 */
public class Bus extends Car {

    private int numberOfSeats;

    public Bus(String brand, String model, int manufactureYear, String registrationMark, String color, int numberOfSeats) {
        super(brand, model, manufactureYear, registrationMark, color);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfSeats=" + numberOfSeats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bus bus = (Bus) o;

        return numberOfSeats == bus.numberOfSeats;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfSeats;
        return result;
    }
}
