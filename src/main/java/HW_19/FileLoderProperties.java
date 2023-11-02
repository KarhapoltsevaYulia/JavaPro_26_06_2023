package HW_19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileLoderProperties {
    public static ArrayList<String> listProperties = new ArrayList<>(10);
    static int userName = 0;
     static int passwordUser = 1;
     static int urlDataBase = 2;

    public  void load(String fileName) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;

            while((line=bufferedReader.readLine())!=null){
                final String[] prop = line.split(" ");
                listProperties.add(userName,prop[userName]);
                listProperties.add(passwordUser,prop[passwordUser]);
                listProperties.add(urlDataBase,prop[urlDataBase]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
