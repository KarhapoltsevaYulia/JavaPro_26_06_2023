package Hw_22.DB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileLoaderProperties {

        public  static ArrayList<String> listProperties = new ArrayList<>();
         int  userName = 0;
         int passwordUser = 1;
         int urlDataBase = 2;

    public int load(String fileName) {
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
        return listProperties.size();
    }
    public  int getUserName() {
        return userName;
    }

    public  int getPasswordUser() {
        return passwordUser;
    }

    public  int getUrlDataBase() {
        return urlDataBase;
    }

}
