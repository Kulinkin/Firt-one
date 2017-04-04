package Project;

import java.util.List;

public class Order {

    private int number;
    private double date;
    private int orderPrice;
    private List<Item> itemList;

    public Order(int number, double date, int orderPrice, List<Item> itemList) {
        this.number = number;
        this.date = date;
        this.orderPrice = orderPrice;
        this.itemList = itemList;
    }

    public int getNumber() {
        return number;
    }

    public double getDate() {
        return date;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public List<Item> getItemList() {
        return itemList;
    }
}
