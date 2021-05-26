package com.company;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

public class DataBaseConn {

    private static Connection con = null;

    static
    {
        String url = "jdbc:mysql://localhost:3306/Cinematograf";
        String user = "root";
        String pass = "Ciscoconpa55";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
}