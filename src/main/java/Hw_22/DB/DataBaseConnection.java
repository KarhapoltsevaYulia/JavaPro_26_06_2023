package Hw_22.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static Hw_22.DB.FileLoaderProperties.listProperties;


public class DataBaseConnection implements AutoCloseable {

        String name;
        String password;
        String url;
        private Connection connection;

        public boolean beginAccess(String nameFileProperties) throws ClassNotFoundException {

            Class.forName("com.mysql.cj.jdbc.Driver");
            FileLoaderProperties fileLoaderProperties = new FileLoaderProperties();
            fileLoaderProperties.load(nameFileProperties);
            name = listProperties.get(fileLoaderProperties.getUserName());
            password = listProperties.get(fileLoaderProperties.getPasswordUser());
            url = listProperties.get(fileLoaderProperties.getUrlDataBase());
            return true;
        }
        public Connection getConnection() throws SQLException {

            return DriverManager.getConnection(url, name, password);
        }

    @Override
    public void close(){

    }
}
