package project.dao;

import project.ConnectionManager;
import project.entity.Item;

import java.sql.*;
import java.util.Optional;

public class ItemDao {
    private static final Object LOCK = new Object();
    private static ItemDao INSTANCE = null;

    public static ItemDao getItemInstance() {
        if (INSTANCE == null) {
            synchronized (LOCK) {
                if (INSTANCE == null) {
                    INSTANCE = new ItemDao();
                }
            }
        }
        return INSTANCE;
    }

    public Optional<Item> saveItem (Item item) {
        try(Connection connection = ConnectionManager.getConnection()) {
            try(PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO items (tipe, brand) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, item.getTipe());
                preparedStatement.setString(2, item.getBrand());
                preparedStatement.executeUpdate();
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    item.setId(generatedKeys.getLong(1));
                    return Optional.of(item);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
