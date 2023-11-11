package Hw_22.DB.Dao;

import Hw_22.DB.Dto.RecordTable;
import Hw_22.DB.SqlRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecordTableDao {
    private final Connection connection;

    public RecordTableDao(Connection connection) {
        this.connection = connection;
    }
    public int addRecord(RecordTable dtoRecordTable) throws SQLException {

        try (PreparedStatement preparedStatement = connection.prepareStatement
                (SqlRequest.ADDRECORD.getNameSqlRequest())) {

            preparedStatement.setInt(1, dtoRecordTable.getId());
            preparedStatement.setString(2, dtoRecordTable.getData());

            return preparedStatement.executeUpdate();
        }
    }


}
