import java.sql.*;


public class PostgresDBConnector {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "329118";

        //load and register the driver
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
        }

        // Create a statement
        try {
            Statement statement = connection.createStatement();
            System.out.println("Statement created");
        } catch (SQLException e) {
            System.out.println("Statement not created");
            throw new RuntimeException(e);
        }

        // Execute a query
        // try {
        //     String sql = "SELECT * FROM users";
        //     statement.executeQuery(sql);
        //     System.out.println("Query executed");
        // } catch (SQLException e) {
        //     System.out.println("Query not executed");
        //     throw new RuntimeException(e);
        // }

        // Prepared Statement
        // try {
        //     String sql = "SELECT * FROM users WHERE id = ?";
        //     PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //     preparedStatement.setInt(1, 1);
        //     preparedStatement.executeQuery();
        //     System.out.println("Prepared Statement executed");
        // } catch (SQLException e) {
        //     System.out.println("Prepared Statement not executed");
        //     throw new RuntimeException(e);
        // }


        // Close the connection
        try {
            connection.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            System.out.println("Connection not closed");
            throw new RuntimeException(e);
        }
    }
}
