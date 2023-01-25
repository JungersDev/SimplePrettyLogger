import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * create by Zaryvnoire Alexandr on 25.01.2023
 **/
public class PrettyLogger {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("YOUR LOG FILE", true))) {
            char[] catchTime = new char[30];
            char[] visuality = new char[20];
            char[] logg = new char[50];

            Date date = new Date();
            String sdf = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss").format(date);

            for (int i = 0; i < catchTime.length; i++) {
                try {
                    catchTime[i] = sdf.toCharArray()[i];
                } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {}
            }

            Arrays.fill(visuality, 0, 5, (char) 32);
            Arrays.fill(visuality, 5, 15, (char) 45);
            visuality[15] = 62;
            Arrays.fill(visuality, 16, visuality.length, (char) 32);

            for (int i = 0; i < logg.length; i++) {
                try {
                    logg[i] = String.valueOf(e).toCharArray()[i]; // --> Use the exception caught variable
                } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {}
            }

            writer.write(catchTime);
            writer.write(visuality);
            writer.write(logg);
            writer.write("\n");
        } catch (IOException ignored) {}
    }
}
