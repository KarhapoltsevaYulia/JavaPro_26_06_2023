package Hw_22.DB;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DataBaseConnectionTest {
    private DataBaseConnection dataBaseConnection;
    private  FileLoaderProperties fileLoaderProperties;

    @Before
    public void setUp(){
        dataBaseConnection= new DataBaseConnection();
        fileLoaderProperties = new FileLoaderProperties();
    }

    @Test
    public void testException(){
        Throwable thrown = assertThrows(NullPointerException.class, () -> {
          dataBaseConnection.beginAccess(null);
        });
        assertNull(thrown.getMessage());
    }

}
