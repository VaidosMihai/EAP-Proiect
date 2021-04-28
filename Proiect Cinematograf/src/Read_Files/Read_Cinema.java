package Read_Files;

import Write_Files.Write_Audit;
import com.company.Cinema;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_Cinema {

    private final static String path = "Proiect Cinematograf/src/CSV_Files/Cinema.csv";

    public  static void ReadCinema(ArrayList<Cinema> items) {
        BufferedReader bufferedReader;
        Write_Audit.writeAudit("Read Cinema");
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine(); //skip the first line
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Cinema(strings[0]));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
