package Project;


public class Item {

    private double price
    private char size;
    private String colour;
    private String brand;
    private String purpose;
    private String matherial;

    public Item(double price, char size, String colour, String brand, String purpose, String matherial) {
        this.price = price;
        this.size = size;
        this.colour = colour;
        this.brand = brand;
        this.purpose = purpose;
        this.matherial = matherial;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getMatherial() {
        return matherial;
    }
}