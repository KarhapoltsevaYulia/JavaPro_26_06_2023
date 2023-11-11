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
    private RecordTableDao recordTableDao = Mockito.mock(RecordTableDao.class);
    private DataBaseConnection dataBaseConnectionMock = Mockito.mock(DataBaseConnection.class);
    private RecordTable recordTable = Mockito.mock(RecordTable.class);
    private Connection connectionMock = Mockito.mock(Connection.class);
    private Statement statementMock = Mockito.mock(Statement.class);
    private DriverManager driverManagerMock = Mockito.mock(DriverManager.class);
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

        /*ResultSet resultSet = Mockito.mock(ResultSet.class);
Mockito.when(resultSet.next()).thenReturn(true).thenReturn(true).thenReturn(true).thenReturn(false);
Mockito.when(resultSet.getString(1)).thenReturn("table_r3").thenReturn("table_r1").thenReturn("table_r2");

Statement statement = Mockito.mock(Statement.class);
Mockito.when(statement.executeQuery("SELECT name FROM tables")).thenReturn(resultSet);

Connection jdbcConnection = Mockito.mock(Connection.class);
Mockito.when(jdbcConnection.createStatement()).thenReturn(statement);*/
    }


}
