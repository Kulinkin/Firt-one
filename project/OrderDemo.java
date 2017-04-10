package project;

import project.dao.OrderDao;
import project.dao.UserDao;
import project.entity.Item;
import project.entity.Order;
import project.entity.User;

import java.util.Optional;

public class OrderDemo {
    public static void main(String[] args) {
        Optional<User> user = UserDao.getUserInstance().getUserById(1L);
        if (user.isPresent()) {
            OrderDao.getOrderInstance().saveOrder(new Order(user.get().getId(), 09.04));
        }
        Optional<Order> order = OrderDao.getOrderInstance().getOrderById(1L);
        if (order.isPresent()) {
            Optional<Order> orderWithItem
                    = OrderDao.getOrderInstance().addItem(order.get(), new Item ("Socks","MF"));
            }
        }
    }


