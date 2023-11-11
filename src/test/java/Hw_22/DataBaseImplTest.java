package Hw_22;

import Hw_22.DB.Dao.RecordTableDao;
import Hw_22.DB.DataBaseConnection;
import Hw_22.DB.Dto.RecordTable;
import Hw_22.DB.FileLoaderProperties;
import Hw_22.DB.SqlRequest;
import com.sun.source.tree.ModuleTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseImplTest {
    private DataBaseImpl dataBase;
    private DataBaseConnection dataBaseConnectionMock = Mockito.mock(DataBaseConnection.class);
    private Connection connectionMock = Mockito.mock(Connection.class);
    private Statement statementMock = Mockito.mock(Statement.class);
    private FileLoaderProperties fileLoaderProperties= Mockito.mock(FileLoaderProperties.class);
    private String fileName;
    private Object[] data;
    @Before
    public void setUp(){
        dataBase =  new DataBaseImpl();
        fileName = "prop.txt";
        data = new String []{"file","file1"};

    }
    @Test
    public  void  saveDataTest() throws Exception {
       Mockito.when(fileLoaderProperties.load(Mockito.anyString())).thenReturn(3);
       Assert.assertEquals(3,fileLoaderProperties.load(Mockito.anyString()));

       Mockito.when(dataBaseConnectionMock.beginAccess(Mockito.anyString())).thenReturn(true);
       Mockito.when(dataBaseConnectionMock.getConnection()).thenReturn(connectionMock);
       Assert.assertNotNull(dataBaseConnectionMock);
        ResultSet resultSet = Mockito.mock(ResultSet.class);
        Mockito.when(resultSet.next()).thenReturn(true).thenReturn(true).thenReturn(true).thenReturn(false);
        Mockito.when(statementMock.executeQuery(SqlRequest.ADDRECORD.getNameSqlRequest())).thenReturn(resultSet);
        Mockito.when(connectionMock.createStatement()).thenReturn(statementMock);

    }


}
