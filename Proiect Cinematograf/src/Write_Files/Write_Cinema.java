package Write_Files;

import java.io.FileWriter;
import java.io.IOException;

public class Write_Cinema {
    private final static String path = "Proiect Cinematograf/src/CSV_Files/Cinema.csv";

    public static void writeCinema(String Name) {
        FileWriter fileWriter;
        Write_Audit.writeAudit("Write Cinema");
        try {
            fileWriter = new FileWriter((path), true);

            String stringBuilder = Name +
                    "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
