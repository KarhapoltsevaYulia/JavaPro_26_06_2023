package Hw_22.DB;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLoaderPropertiesTest {
    private int  userName;
    private  int passwordUser;
    private  int urlDataBase = 2;
    private FileLoaderProperties fileLoaderProperties;
    private File file= Mockito.mock(File.class);
    @Before
    public  void setUp(){
        fileLoaderProperties= new FileLoaderProperties();
        userName = 0;
        passwordUser =1;
        urlDataBase = 2;

    }
    @Test
    public void dataTest(){
        Assert.assertEquals(userName,fileLoaderProperties.getUserName());
        Assert.assertEquals(passwordUser,fileLoaderProperties.getPasswordUser());
        Assert.assertEquals(urlDataBase,fileLoaderProperties.getUrlDataBase());

    }
//    @Test
//    public void loadTest() throws IOException {
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//      Mockito.when(bufferedReader.readLine()).thenReturn(String.valueOf(bufferedReader));
//       // Mockito.when(fileLoaderProperties.load(Mockito.anyString())).thenReturn(3);
//    }

}
