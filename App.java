/*****************************
 * Tony Boyle Jr
 * 12/2/2025
 * App
 *************************/

public class App {
    public static void main(String[] args) {
        // Initialize database and create tables
        DatabaseSetup.createTables();

        // Test inserting a new user
        UserDAO.insertUser("john_doe", 
        "password123", 
        "john.doe@example.com");

        // Test retrieving a user
        UserDAO.getUser("john_doe");
    }
}