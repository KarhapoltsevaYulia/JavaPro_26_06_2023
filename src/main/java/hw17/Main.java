package hw17;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Log.txt");
        FileLogger fileLogger= new FileLogger(file.getName());
        for (int i = 0; i <5 ; i++) {
            fileLogger.recordFile();

            System.out.println(fileLogger);
        }
    }
}
