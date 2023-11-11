package Hw_22.DB.Dao;

import java.sql.*;

import Hw_22.DB.Dto.RecordTable;
import Hw_22.DB.SqlRequest;
import Hw_22.DB.SqlRequestTest;
import com.sun.source.tree.ModuleTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static Hw_22.DB.SqlRequest.ADDRECORD;

public class RecordTableDaoTest {
    private RecordTableDao recordTableDao;
    private RecordTable recordTableMock = Mockito.mock(RecordTable.class);
    private Connection connectionMock =  Mockito.mock(Connection.class);
    private Statement statementMock = Mockito.mock(Statement.class);
    private  PreparedStatement preparedStatementMock = Mockito.mock(PreparedStatement.class);


    @Before
    public void setUp() throws SQLException {
      //  preparedStatementMock = connectionMock.prepareStatement(Mockito.anyString());
        this.recordTableDao= new RecordTableDao(connectionMock);
        this.connectionMock =  Mockito.mock(Connection.class);;
    }
    @Test
    public void connectionTest(){
        Assert.assertNotNull(connectionMock);


    }
    @Test
    public void addRecordTest() throws SQLException {

        Mockito.when(connectionMock.prepareStatement(ADDRECORD.getNameSqlRequest())).thenReturn(preparedStatementMock);
      //  Mockito.when(preparedStatementMock.).thenReturn(preparedStatementMock);
        preparedStatementMock.setInt(Mockito.anyInt(),Mockito.anyInt());
//        ResultSet resultSet = Mockito.mock(ResultSet.class);
//        Mockito.when(resultSet.next()).thenReturn(true).thenReturn(true);
//
//        Mockito.when(statementMock.executeQuery(ADDRECORD.getNameSqlRequest())).thenReturn(resultSet);
//        Mockito.when(connectionMock.createStatement()).thenReturn(statementMock);
//        Mockito.when(connectionMock.prepareStatement(ADDRECORD.getNameSqlRequest())).thenReturn(preparedStatementMock);
//
//        PreparedStatement preparedStatementMock = Mockito.mock(PreparedStatement.class);
//        preparedStatementMock.setInt(Mockito.anyInt(),Mockito.anyInt());
//        Connection jdbcConnection = Mockito.mock(Connection.class);
//        Mockito.when(jdbcConnection.prepareStatement(ADDRECORD.getNameSqlRequest())).thenReturn(preparedStatementMock);
     //   Mockito.when(
      //  preparedStatementMock.setInt(Mockito.anyInt(),Mockito.anyInt()),
      //  preparedStatementMock.setString(Mockito.anyInt(), Mockito.anyString())).thenReturn(preparedStatementMock);
       // Mockito.when(preparedStatementMock.setInt(1,1)).thenReturn(1);//,recordTableMock.getId())).thenReturn(1);
      //  Mockito.when(recordTableDao.addRecord(recordTableMock)).thenReturn(1);

    }
 /*ResultSet resultSet = Mockito.mock(ResultSet.class);
Mockito.when(resultSet.next()).thenReturn(true).thenReturn(true).thenReturn(true).thenReturn(false);
Mockito.when(resultSet.getString(1)).thenReturn("table_r3").thenReturn("table_r1").thenReturn("table_r2");

Statement statement = Mockito.mock(Statement.class);
Mockito.when(statement.executeQuery("SELECT name FROM tables")).thenReturn(resultSet);

Connection jdbcConnection = Mockito.mock(Connection.class);
Mockito.when(jdbcConnection.createStatement()).thenReturn(statement);*/

}
