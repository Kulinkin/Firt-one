package project.dao;

import project.ConnectionManager;
import project.entity.Item;
import project.entity.User;

import java.sql.*;
import java.util.Optional;

public class UserDao {

    private static final Object LOCK = new Object();
    private static UserDao INSTANCE = null;

    public static UserDao getUserInstance() {
        if (INSTANCE == null) {
            synchronized (LOCK) {
                if (INSTANCE == null) {
                    INSTANCE = new UserDao();
                }
            }
        }
        return INSTANCE;
    }

    public Optional<User> saveUser(User user) {
        try(Connection connection = ConnectionManager.getConnection()) {
            try(PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO users (name) VALUES (?)", Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, user.getName());
                preparedStatement.executeUpdate();
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    user.setId(generatedKeys.getLong(1));
                    return Optional.of(user);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public Optional<User> getUserById(long id) {
        try(Connection connection = ConnectionManager.getConnection()) {
            try(PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM users WHERE id = ?")) {
                preparedStatement.setLong(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    return Optional.of(new User(id, resultSet.getString( "name")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
