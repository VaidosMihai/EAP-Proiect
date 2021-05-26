package DB_Files;

import Write_Files.Write_Audit;
import com.company.Camera;
import com.company.Cinema;
import com.company.Client;
import com.company.Film;

import java.sql.SQLException;
import java.util.Scanner;

public class SysConnect {
    public void AddCinema() throws SQLException {
        Write_Audit.writeAudit("Add Cinema");
        Cinema ang = new Cinema();
        CinemaDB angDB = new CinemaDB();
        angDB.add(ang);
    }

    public void DeleteCinema() throws SQLException {
        Write_Audit.writeAudit("Delete Cinema");
        CinemaDB angDB = new CinemaDB();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the cinema name : ");
        String x = in.nextLine();
        angDB.delete(x);
    }

    public void SelectCinema() throws SQLException {
        Write_Audit.writeAudit("Select cinema");
        CinemaDB angDB = new CinemaDB();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the cinema name:");
        String x = in.nextLine();
        Cinema e = angDB.getCinema(x);
        System.out.println(e.getCinema_name());
    }

    public void UpdateCinema() throws SQLException {
        Write_Audit.writeAudit("Update Cinema");
        CinemaDB angDB = new CinemaDB();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the cinema name:");
        String x = in.nextLine();
        Cinema ang = angDB.getCinema(x);
        System.out.println("Enter the NEW cinema name:");
        ang.setCinemaName(in.nextLine());
        angDB.update(ang);
    }

    public void AddFilm() throws SQLException {
        Write_Audit.writeAudit("Add Movie");
        Film ang = new Film();
        FilmeDB angDao = new FilmeDB();
        angDao.add(ang);
    }

    public void DeleteFilm() throws SQLException {
        Write_Audit.writeAudit("Delete Movie");
        FilmeDB angDao = new FilmeDB();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the movie name : ");
        String x = in.nextLine();
        angDao.delete(x);
    }

    public void SelectFilm() throws SQLException {
        Write_Audit.writeAudit("Select Movie");
        FilmeDB angDao = new FilmeDB();
        Scanner in = new Scanner(System.in);
        System.out.println("Select the movie name:");
        String x = in.nextLine();
        Film e = angDao.getFilm(x);
        System.out.println(e.getName() + " "
                + e.getAge_required() + " " + e.getStart_time() + " " + e.getPrice());
    }

    public void UpdateFilm() throws SQLException {
        Write_Audit.writeAudit("Update Movie");
        FilmeDB angDao = new FilmeDB();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the movie name:");
        String x = in.nextLine();
        Film ang = angDao.getFilm(x);
        System.out.println("Enter the NEW movie name:");
        ang.setFilm_name(in.nextLine());
        angDao.update(ang);
    }

    public void AddCamera() throws SQLException {
        Write_Audit.writeAudit("Add Room");
        Camera ing = new Camera();
        CameraDB ingDao = new CameraDB();
        ingDao.add(ing);
    }

    public void DeleteCamera() throws SQLException {
        Write_Audit.writeAudit("Delete Room");
        CameraDB ingDao = new CameraDB();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the room ID: ");
        String x = in.nextLine();
        ingDao.delete(Integer.valueOf(x));
    }

    public void SelectCamera() throws SQLException {
        Write_Audit.writeAudit("Select Room");
        CameraDB ingDB = new CameraDB();
        Scanner in = new Scanner(System.in);
        System.out.println("ID room:");
        String x = in.nextLine();
        Camera e = ingDB.getCamera(Integer.valueOf(x));
        System.out.println(e.getRows() + " " + e.getColumns());
    }

    public void UpdateCamera() throws SQLException {
        Write_Audit.writeAudit("Update Room");
        CameraDB ingDB = new CameraDB();
        Scanner in = new Scanner(System.in);
        System.out.println("ID room:");
        String x = in.nextLine();
        Camera ing = ingDB.getCamera(Integer.valueOf(x));
        System.out.println("New rows:");
        ing.setRows(in.nextInt());
        ingDB.update(ing);
    }

    public void AddClient() throws SQLException {
        Write_Audit.writeAudit("New Client");
        Client zs = new Client();
        ClientDB zsDao = new ClientDB();
        zsDao.add(zs);
    }

    public void DeleteClient() throws SQLException {
        Write_Audit.writeAudit("Delete Client");
        ClientDB zsDao = new ClientDB();
        Scanner in = new Scanner(System.in);
        System.out.println("Numele clientului: ");
        String x = in.nextLine();
        zsDao.delete(x);
    }

    public void SelectClient() throws SQLException {
        Write_Audit.writeAudit("Select Client");
        ClientDB zsDao = new ClientDB();
        Scanner in = new Scanner(System.in);
        System.out.println("Client first name:");
        String x = in.nextLine();
        Client e = zsDao.getClient(x);
        System.out.println(e.getFirst_name() + " " + e.getLast_name());
    }

    public void UpdateClient() throws SQLException {
        Write_Audit.writeAudit("Update Client");
        ClientDB clDB = new ClientDB();
        Scanner in = new Scanner(System.in);
        System.out.println("Client first name:");
        String x = in.nextLine();
        Client zs = clDB.getClient(x);
        System.out.println("New first name:");
        zs.setFirst_name(in.nextLine());
        clDB.update(zs);
    }
}