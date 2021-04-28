package Read_Files;

import Write_Files.Write_Audit;
import com.company.Client;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Read_Client {

    private final static String path = "Proiect Cinematograf/src/CSV_Files/Client.csv";

    public  static void ReadClient(ArrayList<Client> items) {
        BufferedReader bufferedReader;
        Write_Audit.writeAudit("Read Client");
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine(); //skip the first line
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Client(strings[0],strings[1],Integer.parseInt(strings[2])));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
