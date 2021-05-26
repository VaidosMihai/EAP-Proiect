package DB_Files;

        import com.company.Camera;
        import com.company.DataBaseConn;

        import java.sql.Connection;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.SQLException;


public class  CameraDB{

    static Connection con = DataBaseConn.getConnection();

    public static Camera getCamera(Integer id)
            throws SQLException
    {

        String query = "select * from Camera where id = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);
        Camera ang = new Camera(id);/// lini/colaone
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            ang.setRows(rs.getInt("randuri"));
            ang.setColumns(rs.getInt("coloane"));
        }

        if (check == true) {
            return ang;
        }
        else
            return null;
    }

    public int add(Camera ang)
            throws SQLException
    {
        String query = "insert into Camera(id, capacity,randuri,coloane) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, ang.getId());
        ps.setInt(2, ang.getCapacity());
        ps.setInt(3, ang.getRows());
        ps.setInt(4, ang.getColumns());
        int n = ps.executeUpdate();
        return n;
    }

    public void delete(Integer id)
            throws SQLException
    {
        String query = "delete from Camera where id= ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public void update(Camera ang)
            throws SQLException
    {

        String query = "update Camera set randuri = ? where capacity < ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, ang.getRows());
        ps.setInt(2, ang.getCapacity());
        ps.executeUpdate();
    }
}