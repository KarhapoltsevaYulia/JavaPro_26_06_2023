package HW_19;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static HW_19.FileLoderProperties.*;

public class DataBaseConnection {
    String name;
    String password;
    String url;

    public void beginAccess(String nameFileProperties) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        FileLoderProperties fileLoderProperties = new FileLoderProperties();
        fileLoderProperties.load(nameFileProperties);
        name = listProperties.get(userName);
        password = listProperties.get(passwordUser);
        url = listProperties.get(urlDataBase);
    }

    public Connection getConnection() throws SQLException{

        return DriverManager.getConnection(url, name, password);
    }

    public void close(Connection connection) throws SQLException {
            connection.close();
        }
    }
