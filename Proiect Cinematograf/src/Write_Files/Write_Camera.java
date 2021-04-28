package Write_Files;

import java.io.FileWriter;
import java.io.IOException;

public class Write_Camera {
    private final static String path = "Proiect Cinematograf/src/CSV_Files/Camera.csv";

    public static void writeCamera(int rows, int columns) {
        FileWriter fileWriter;
        Write_Audit.writeAudit("Write Camera");
        try {
            fileWriter = new FileWriter((path), true);

            String stringBuilder = rows +
                    "," +
                    columns +
                    "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
