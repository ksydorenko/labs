package lab5;

import java.sql.*;

public class DatabaseOutput {

    static final String DB_URL = "jdbc:sqlserver://127.0.0.1:1434;databaseName=University;integratedSecurity=true";

    public static void getTable(String tableName) {
        String query = "SELECT * FROM " + tableName;
        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery(query);
        ) {
            while (result.next()) {
                System.out.println("Surname: " + result.getString("Surname"));
                System.out.println("Name: " + result.getString("Name"));
                System.out.println("Date of birth: " + result.getString("Date of birth"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
