package Hw_22.DB.Dao;

import java.sql.*;

import Hw_22.DB.Dto.RecordTable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static Hw_22.DB.SqlRequest.ADDRECORD;

public class RecordTableDaoTest {
    private RecordTableDao recordTableDao;
    private Connection connectionMock =  Mockito.mock(Connection.class);
    private  PreparedStatement preparedStatementMock = Mockito.mock(PreparedStatement.class);


    @Before
    public void setUp() throws SQLException {
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
        preparedStatementMock.setInt(Mockito.anyInt(),Mockito.anyInt());
    }

}
