package testingServlets;

import java.sql.*;

public class OpenDataConnection {

    public static void main(String[] args) {

        // Setting.
        String connectionUrl = "jdbc:sqlserver://SERVER.database.windows.net:1433;database=DATABASE;encrypt=true;trustServerCertificate=true;";
        String user = "USER@SERVER";
        String pass = "PASSWORD";

        // Declare the JDBC object.
        Connection conn = null;

        try {
            // Establish the connection.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionUrl, user, pass);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}