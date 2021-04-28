package Write_Files;

import java.io.FileWriter;
import java.io.IOException;

public class Write_Client {
    private final static String path = "Proiect Cinematograf/src/CSV_Files/Client.csv";

    public static void writeClient(String first_name, String last_name, int age) {
        FileWriter fileWriter;
        Write_Audit.writeAudit("Write Client");
        try {
            fileWriter = new FileWriter((path), true);

            String stringBuilder = first_name +
                    "," +
                    last_name +
                    "," +
                    age +
                    "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
