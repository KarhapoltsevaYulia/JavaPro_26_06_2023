package Hw_22;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;

public class InMemoryImplTest {
    private InMemoryImpl inMemory= new InMemoryImpl();;
    private Object[] strings;
    private ArrayList<Object> arrayList = new ArrayList<>();
    private String nameFile;

    @Before
    public  void setUp(){
        strings = new String[]{"aaa", "BBB", "ccc"};
        nameFile= null;
    }

    @Test
    public void testSaveData(){
        assertNotNull(strings);
        arrayList.addAll(Arrays.asList(strings));
        assertNotNull(arrayList);
        assertEquals(arrayList.size(),inMemory.saveData(nameFile,strings));

    }
    @Test
    public void getStringArrayListTest(){
        arrayList.addAll(Arrays.asList(strings));
        assertEquals(strings.length,arrayList.size());
        inMemory.saveData(null, strings);
        for(int i= 0; i< strings.length;i++){
            assertEquals(inMemory.getStringArrayList().get(i),arrayList.get(i));
        }

        assertEquals(arrayList.size(),inMemory.getStringArrayList().size(),strings.length);
    }
    @Test
    public void testException(){
        Throwable thrown = assertThrows(RuntimeException.class, () -> {
            inMemory.saveData(null,null);
        });
        assertNotNull(thrown.getMessage());

    }


}

