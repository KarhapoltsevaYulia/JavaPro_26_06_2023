package Hw_22;

import Hw_22.DB.Dao.RecordTableDao;
import Hw_22.DB.DataBaseConnection;
import Hw_22.DB.Dto.RecordTable;

public class DataBaseImpl implements FitnessTracker {

    @Override
    public int saveData(String fileName, Object... data) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
            dataBaseConnection.beginAccess(fileName);
            RecordTableDao recordTableDao = new RecordTableDao(dataBaseConnection.getConnection());
           int k =0;
        for (Object datum : data) {

            RecordTable recordTable = new RecordTable( (String) datum);
            recordTableDao.addRecord(recordTable);
           k++;
        }
            dataBaseConnection.close();
        return 1;
    }
}




