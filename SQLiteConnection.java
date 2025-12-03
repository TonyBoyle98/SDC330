/*****************************
 * Tony Boyle Jr
 * 12/2/2025
 * SQLiteConnection
 *************************/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {
    private static final String URL = "jdbc:sqlite:your_database_name.db"; // Update the DB name

    // Establish connection to the SQLite database
    public static Connection connect() {
        try {
            Connection connection = DriverManager.getConnection(URL);
            System.out.println("Connection to SQLite has been established.");
            return connection;
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }
    }

    // Close the database connection
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}