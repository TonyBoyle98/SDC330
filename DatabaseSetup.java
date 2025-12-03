/*****************************
 * Tony Boyle Jr
 * 12/2/2025
 * DatabaseSetup
 *************************/
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseSetup {
    // This method creates the necessary tables in the SQLite database
    public static void createTables() {
        // Example SQL statement to create a table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "username TEXT NOT NULL, "
                + "password TEXT NOT NULL, "
                + "email TEXT);";

        try (Connection connection = SQLiteConnection.connect();
             Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
            System.out.println("Table 'users' created or already exists.");
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }
}