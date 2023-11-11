package Hw_22;


import java.sql.SQLException;

public interface FitnessTracker {
    int saveData(String fileName,Object... data) throws Exception;

}
