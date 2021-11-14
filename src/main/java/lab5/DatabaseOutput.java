package lab5;

import java.sql.*;

public class DatabaseOutput {

    static final String DB_URL = "jdbc:sqlserver://127.0.0.1:1434;databaseName=University;integratedSecurity=true";

    public static void getTable(String tableName) {
        String query = "SELECT * FROM "+ tableName;
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
        ) {
            while(rs.next()){
                System.out.println("Surname: "+rs.getString("Surname"));
                System.out.println("Name: "+rs.getString("Name"));
                System.out.println("Date of birth: "+rs.getString("Date of birth"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
