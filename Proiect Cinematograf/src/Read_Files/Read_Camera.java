package Read_Files;

import Write_Files.Write_Audit;
import com.company.Camera;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_Camera{

    private final static String path = "Proiect Cinematograf/src/CSV_Files/Camera.csv";

    public  static void ReadCamera(ArrayList<Camera> items) {
        BufferedReader bufferedReader;
        Write_Audit.writeAudit("Read Camera");
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine(); //skip the first line
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Camera(Integer.parseInt(strings[0]),Integer.parseInt(strings[1])));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}