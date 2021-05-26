package DB_Files;

import com.company.Film;
import com.company.DataBaseConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FilmeDB {

    static Connection con = DataBaseConn.getConnection();

    public static Film getFilm(String film_name)
            throws SQLException {

        String query = "select * from Film where film_name = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, film_name);
        Film ang = new Film(0);
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            ang.setFilm_name(rs.getString("film_name"));
            ang.setAge_required(rs.getInt("age_required"));
            ang.setStart_time(rs.getString("start_time"));
            ang.setPrice(rs.getFloat("price"));
        }

        if (check == true) {
            return ang;
        } else
            return null;
    }

    public int add(Film ang)
            throws SQLException {
        String query = "insert into Film(film_name, age_required, start_time, price) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, ang.getName());
        ps.setInt(2, ang.getAge_required());
        ps.setString(3, ang.getStart_time());
        ps.setFloat(4, ang.getPrice());
        int n = ps.executeUpdate();
        return n;
    }

    public void delete(String film_name)
            throws SQLException {
        String query = "delete from Film where film_name= ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, film_name);
        ps.executeUpdate();
    }

    public void update(Film ang)
            throws SQLException {

        String query = "update Film set film_name = ? where price = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, ang.getName());
        ps.setFloat(2, ang.getPrice());
        ps.executeUpdate();
    }
}
