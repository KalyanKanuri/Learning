import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class PostgresDBConnector {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "329118";

        // load and register the driver
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found");
        }

        // Create a connection
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException ex) {
            System.out.println("Connection failed.");
            ex.printStackTrace();
            return;
        }

        // Create a statement
        Statement statement = null;
        try {
            statement = connection.createStatement();
            System.out.println("Statement created" + statement);
        } catch (SQLException e) {
            System.out.println("Statement not created");
            throw new StatementCreationException("Failed to create statement", e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Statement not closed" +e);
                }
            }
        }

        // Execute a query
        // try {
        // String sql = "SELECT * FROM users";
        // statement.executeQuery(sql);
        // System.out.println("Query executed");
        // } catch (SQLException e) {
        // System.out.println("Query not executed");
        // throw new RuntimeException(e);
        // }

        // Prepared Statement
        // try {
        // String sql = "SELECT * FROM users WHERE id = ?";
        // PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // preparedStatement.setInt(1, 1);
        // preparedStatement.executeQuery();
        // System.out.println("Prepared Statement executed");
        // } catch (SQLException e) {
        // System.out.println("Prepared Statement not executed");
        // throw new RuntimeException(e);
        // }

        // Close the connection
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Connection closed");
            }
        } catch (SQLException e) {
            System.out.println("Connection not closed");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static class StatementCreationException extends RuntimeException {
        public StatementCreationException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
