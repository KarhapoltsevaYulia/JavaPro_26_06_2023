package Hw_22.DB.Dto;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class RecordTableTest {
    private RecordTable recordTable ;
    private String dataTest;
    private  int idTest;
    @Before
    public void  setUp(){
        recordTable = new RecordTable("Test");
        dataTest = "Test";
        idTest= 0;

    }
    @Test
    public void testData(){

        Assert.assertEquals(dataTest,"Test");
        Assert.assertNotNull(dataTest);
        Assert.assertEquals(idTest,0);

    }
    @Test
    public  void getIdTest(){
        Assert.assertEquals(recordTable.getId(),idTest);
    }
    @Test
    public void getDataTest(){
        Assert.assertEquals(recordTable.getData(),dataTest);
    }

}
