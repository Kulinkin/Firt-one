package lesson10.parking.Cars;

/**
 * Created by Артём on 12.03.2017.
 */
public abstract class Car {

    protected String brand;
    protected String model;
    protected int manufactureYear;
    protected String licensePlate;
    protected String color;

    public Car(String brand, String model, int manufactureYear, String registrationMark, String color) {
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.licensePlate = registrationMark;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", licensePlate='" + licensePlate + '\'' +
                ", color='" + color + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (manufactureYear != car.manufactureYear) return false;
        if (!brand.equals(car.brand)) return false;
        if (!model.equals(car.model)) return false;
        if (!licensePlate.equals(car.licensePlate)) return false;
        return color.equals(car.color);
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + manufactureYear;
        result = 31 * result + licensePlate.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }
}
