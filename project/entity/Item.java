package project.entity;


public class Item {
    private long id;
    private String tipe;
    private double price;
    private char size;
    private String colour;
    private String brand;
    private String purpose;
    private String matherial;



    public Item(long id, String tipe, double price, char size, String colour, String brand, String purpose, String matherial) {
        this.id = id;
        this.tipe = tipe;
        this.price = price;
        this.size = size;
        this.colour = colour;
        this.brand = brand;
        this.purpose = purpose;
        this.matherial = matherial;
    }

    public Item(String tipe, String brand) {
        this.tipe = tipe;
        this.brand = brand;
    }

    public long getId() {
        return id;
    }

    public String getTipe() {
        return tipe;
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

    public void setId(long id) {
        this.id = id;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setMatherial(String matherial) {
        this.matherial = matherial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.price, price) != 0) return false;
        if (size != item.size) return false;
        if (tipe != null ? !tipe.equals(item.tipe) : item.tipe != null) return false;
        if (colour != null ? !colour.equals(item.colour) : item.colour != null) return false;
        if (brand != null ? !brand.equals(item.brand) : item.brand != null) return false;
        if (purpose != null ? !purpose.equals(item.purpose) : item.purpose != null) return false;
        return matherial != null ? matherial.equals(item.matherial) : item.matherial == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = tipe != null ? tipe.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) size;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (purpose != null ? purpose.hashCode() : 0);
        result = 31 * result + (matherial != null ? matherial.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", tipe='" + tipe + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", colour='" + colour + '\'' +
                ", brand='" + brand + '\'' +
                ", purpose='" + purpose + '\'' +
                ", matherial='" + matherial + '\'' +
                '}';
    }
}