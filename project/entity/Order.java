package project.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Order {
    private long id;
    private long userId;
    private double dateOfOpening;
    private double dateOfClosing;
    private String orderStatus;
    private User user;
    private Set<Item> items = new HashSet<>();

    public Order(long userId, double dateOfOpening) {
        this.userId = userId;
        this.dateOfOpening = dateOfOpening;
    }

    public Order(long userId, double dateOfOpening, double dateOfClosing, String orderStatus) {
        this.userId = userId;
        this.dateOfOpening = dateOfOpening;
        this.dateOfClosing = dateOfClosing;
        this.orderStatus = orderStatus;
    }

    public Order(long id, long userId, double dateOfOpening, double dateOfClosing, String orderStatus) {
        this.id = id;
        this.userId = userId;
        this.dateOfOpening = dateOfOpening;
        this.dateOfClosing = dateOfClosing;
        this.orderStatus = orderStatus;
    }

    public Order(User user, double dateOfOpening) {
        this.dateOfOpening = dateOfOpening;
        this.user = user;
    }

    public Order(long id) {
        this.id = id;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (userId != order.userId) return false;
        if (Double.compare(order.dateOfOpening, dateOfOpening) != 0) return false;
        if (Double.compare(order.dateOfClosing, dateOfClosing) != 0) return false;
        return orderStatus != null ? orderStatus.equals(order.orderStatus) : order.orderStatus == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (userId ^ (userId >>> 32));
        temp = Double.doubleToLongBits(dateOfOpening);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dateOfClosing);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", dateOfOpening=" + dateOfOpening +
                ", dateOfClosing=" + dateOfClosing +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getDateOfOpening() {
        return dateOfOpening;
    }

    public void setDateOfOpening(double dateOfOpening) {
        this.dateOfOpening = dateOfOpening;
    }

    public double getDateOfClosing() {
        return dateOfClosing;
    }

    public void setDateOfClosing(double dateOfClosing) {
        this.dateOfClosing = dateOfClosing;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
