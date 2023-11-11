package Hw_22;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        FactoryMethod factoryMethod = new FactoryMethod();
        factoryMethod.createStorage(TypeSave.IN_MEMORY).saveData(null, "AAAA");
        System.out.println(factoryMethod.createStorage(TypeSave.FILE).saveData("File.txt","kk", "lll"));
  factoryMethod.createStorage(TypeSave.DB).saveData("prop.txt","1","2","3");

    }
}
