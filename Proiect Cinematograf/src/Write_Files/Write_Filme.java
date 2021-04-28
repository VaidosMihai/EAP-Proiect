package Write_Files;

import java.io.FileWriter;
import java.io.IOException;

public class Write_Filme {
    private final static String path = "Proiect Cinematograf/src/CSV_Files/Filme.csv";

    public static void writeFilme(String name, int age_required, String start_time, float price) {
        FileWriter fileWriter;
        Write_Audit.writeAudit("Write Film");
        try {
            fileWriter = new FileWriter((path), true);

            String stringBuilder = name +
                    "," +
                    age_required +
                    "," +
                    start_time +
                    "," +
                    price +
                    "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
