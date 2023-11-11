package Hw_22;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class FactoryMethodTest {
    private FactoryMethod factoryMethod = new FactoryMethod();
    private InMemoryImpl inMemory = new InMemoryImpl();
    private FileImpl fileImp = new FileImpl();
    private DataBaseImpl dataBase = new DataBaseImpl();

    @Before
    public void setUp() {
        factoryMethod = new FactoryMethod();
    }

    @Test
    public void createStorageInMemoryTest() {
        Assertions.assertEquals(inMemory.getClass(), factoryMethod.createStorage(TypeSave.IN_MEMORY).getClass());
    }

    @Test
    public void createStorageInFileTest() {
        Assertions.assertEquals(fileImp.getClass(), factoryMethod.createStorage(TypeSave.FILE).getClass());
    }

    @Test
    public void createStorageInDBTest() {
        Assertions.assertEquals(dataBase.getClass(), factoryMethod.createStorage(TypeSave.DB).getClass());
    }
    @Test
    public void exceptionMethod(){
        Throwable throwable = assertThrows(NullPointerException.class, () -> {
            factoryMethod.createStorage(null);
        });
        assertNotNull(throwable.getMessage());
    }
}
