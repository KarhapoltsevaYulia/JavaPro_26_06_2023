package hw_17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileLoggerConfigurationLoader extends FileLoggerConfiguration{

    public static void load(String fileName) throws FileNotFoundException {
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            int i = 0;
            String line;

            while((line=bufferedReader.readLine())!=null){
                final String[] prop = line.split("|",2);
                loggingLevel.put(Integer.valueOf(prop[0]), String.valueOf(prop[1]));
                level= loggingLevel.size();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
