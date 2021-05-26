package DB_Files;

import com.company.Client;
import com.company.DataBaseConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClientDB {

    static Connection con = DataBaseConn.getConnection();

    public static Client getAllClient(String first_name)
            throws SQLException {

        String query = "select * from Client";
        PreparedStatement ps = con.prepareStatement(query);

        Client ang = new Client(0);
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            ang.setFirst_name(rs.getString("first_name"));
            ang.setLast_name(rs.getString("last_name"));
            ang.setAge(rs.getInt("age"));
        }

        if (check == true) {
            return ang;
        } else
            return null;
    }

    public static Client getClient(String first_name)
            throws SQLException {

        String query = "select * from Client where first_name = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, first_name);
        Client ang = new Client(0);
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            ang.setFirst_name(rs.getString("first_name"));
            ang.setLast_name(rs.getString("last_name"));
            ang.setAge(rs.getInt("age"));
        }

        if (check == true) {
            return ang;
        } else
            return null;
    }

    public int add(Client ang)
            throws SQLException {
        String query = "insert into Client(first_name, last_name, age) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, ang.getFirst_name());
        ps.setString(2, ang.getLast_name());
        ps.setInt(3, ang.getAge());
        int n = ps.executeUpdate();
        return n;
    }

    public void delete(String first_name)
            throws SQLException {
        String query = "delete from Client where first_name= ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, first_name);
        ps.executeUpdate();
    }

    public void update(Client ang)
            throws SQLException {

        String query = "update Client set first_name = ? where last_name = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, ang.getFirst_name());
        ps.setString(2, ang.getLast_name());
        ps.executeUpdate();
    }
}
