package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private String userNAme = "root";
    private String password = "rootroot";
    private String dbURL = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbURL, userNAme, password);
    }

    public void showDBErrorMessage(SQLException exception){
        exception.printStackTrace();
    }


}
