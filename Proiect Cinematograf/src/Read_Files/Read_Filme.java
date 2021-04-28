package Read_Files;


import Write_Files.Write_Audit;
import com.company.Film;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_Filme {

    private final static String path = "Proiect Cinematograf/src/CSV_Files/Filme.csv";

    public  static void ReadFilme(ArrayList<Film> items) {
        BufferedReader bufferedReader;
        Write_Audit.writeAudit("Read Film");
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine(); //skip the first line
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Film(strings[0],Integer.parseInt(strings[1]),strings[2],Float.parseFloat(strings[3])));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
