package Hw_22;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.nio.file.Files;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FileImplTest {
    private FileImpl fileImplTest = new FileImpl();
    private Object[] strings;
    private String nameFile;
    private static File dir;
    private Object[] prop;

    @Before
    public void createCollection() throws IOException {
        nameFile="Test.txt";
        strings = new String[]{"aaa", "BBB", "ccc"};
        dir = Files.createTempDirectory(nameFile).toFile();

    }
    @Test
    public void saveDataTest(){
        int lengthStrings = strings.length;
        assertNotNull(nameFile);
        assertNotNull(strings);
        assertEquals(lengthStrings, fileImplTest.saveData(nameFile, strings));
    }
    @Test
    public void testRunExceptionFile()  {

        Throwable thrown = assertThrows(NullPointerException.class, () -> {
            fileImplTest.saveData(null, strings);
        });
        assertNull(thrown.getMessage());
    }
    @Test
    public void testRunExceptionData()  {
        Throwable thrown = assertThrows(RuntimeException.class, () -> {
            fileImplTest.saveData(nameFile, null);
        });
        assertNotNull(thrown.getMessage());
    }
    @Test
    public void dataFileTest() throws IOException {
        int i=0;
        try(BufferedReader bufferedReader= new BufferedReader
               (new FileReader(nameFile))){
           String line;
           while((line = bufferedReader.readLine())!=null){
               prop = line.split(" ");
             //  assertEquals(prop.toString(),strings[i]);
               if (i== strings.length){
                   break;
               }
               i++;
           }
        }
    }

    @AfterClass
    public static void afterClass() throws IOException {
        if (dir == null) {
            return;
        }
        dir.delete();
    }

}
