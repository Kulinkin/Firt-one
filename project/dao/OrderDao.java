package project.dao;

import project.ConnectionManager;
import project.entity.Item;
import project.entity.Order;
import project.entity.User;

import java.sql.*;
import java.util.Optional;

public class OrderDao {
    private static final Object LOCK = new Object();
    private static OrderDao INSTANCE = null;

    public static OrderDao getOrderInstance() {
        if (INSTANCE == null) {
            synchronized (LOCK) {
                if (INSTANCE == null) {
                    INSTANCE = new OrderDao();
                }
            }
        }
        return INSTANCE;
    }

    public void saveOrder(Order order) {
        try (Connection connection = ConnectionManager.getConnection()) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO orders (user_id, date_of_opening) VALUES (?, ?);")) {
                preparedStatement.setLong(1, order.getUserId());
                preparedStatement.setDouble(2, order.getDateOfOpening());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Optional<Order> getOrderById(long id) {
        try(Connection connection = ConnectionManager.getConnection()) {
            try(PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM users WHERE id = ?")) {
                preparedStatement.setLong(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    return Optional.of(new Order(id));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public Optional <Order> addItem (Order order, Item item) {
        try(Connection connection = ConnectionManager.getConnection()) {
            connection.setAutoCommit(false);
            try(PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO items (tipe) VALUES (?)", Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, item.getTipe());
                preparedStatement.executeUpdate();
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    item.setId(generatedKeys.getLong(1));
                }
            }
            try(PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO orders_items (order_id, item_id) VALUES (?, ?)")) {
                preparedStatement.setLong(1, order.getId());
                preparedStatement.setLong(2, item.getId());
                preparedStatement.executeUpdate();
            }
            connection.commit();
            order.addItem(item);
            return Optional.of(order);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
