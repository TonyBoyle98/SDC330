/*****************************
 * Tony Boyle Jr
 * 12/2/2025
 * UserDAO
 *************************/

import java.sql.*;

public class UserDAO {

    // Method to insert a user into the database
    public static void insertUser(String username, String password, String email) {
        String insertSQL = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";

        try (Connection connection = SQLiteConnection.connect();
             PreparedStatement statement = connection.prepareStatement(insertSQL)) {
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, email);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User inserted successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error inserting user: " + e.getMessage());
        }
    }

    // Method to fetch a user by username
    public static void getUser(String username) {
        String selectSQL = "SELECT * FROM users WHERE username = ?";
        
        try (Connection connection = SQLiteConnection.connect();
             PreparedStatement statement = connection.prepareStatement(selectSQL)) {
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                System.out.println("User found: " + resultSet.getString("username"));
            } else {
                System.out.println("User not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error fetching user: " + e.getMessage());
        }
    }
}