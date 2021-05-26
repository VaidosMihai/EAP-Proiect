package DB_Files;

import com.company.Camera;
import com.company.Cinema;
import com.company.DataBaseConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CinemaDB {

    static Connection con = DataBaseConn.getConnection();

    public static Cinema getCinema(String name)
            throws SQLException {

        String query = "select * from Cinema where cinema_name = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, name);
        Cinema ang = new Cinema(name);
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            ang.setCinemaName(rs.getString("cinema_name"));
        }

        if (check == true) {
            return ang;
        } else
            return null;
    }

    public int add(Cinema ang)
            throws SQLException {
        String query = "insert into Cinema(cinema_name) VALUES (?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, ang.getCinema_name());

        int n = ps.executeUpdate();
        return n;
    }

    public void delete(String name)
            throws SQLException {
        String query = "delete from Cinema where cinema_name= ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);
        ps.executeUpdate();
    }

    public void update(Cinema ang)
            throws SQLException {

        String query = "update Cinema set cinema_name = ? where cinema_name = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, ang.getCinema_name());
        ps.setString(2, ang.getCinema_name());
        ps.executeUpdate();
    }
}