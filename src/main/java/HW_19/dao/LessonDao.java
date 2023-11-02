package HW_19.dao;

import HW_19.SqlRequest;
import HW_19.dto.Lesson;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LessonDao {
    private Connection connection;
    private final List<Lesson> lessons = new ArrayList<>();



    public LessonDao(Connection connection) throws SQLException {
        this.connection = connection;
    }

    public int addLesson(Lesson lesson) throws SQLException {

        try (PreparedStatement preparedStatement = connection.prepareStatement
                (SqlRequest.ADDLESSON.getNameSqlRequest())) {
            preparedStatement.setInt(1, lesson.getId());
            preparedStatement.setString(2, lesson.getName());
            preparedStatement.setInt(3, lesson.getHomework());
            return preparedStatement.executeUpdate();
        }
    }

   public List<Lesson> deleteLessonID(int id)throws SQLException {
    try (PreparedStatement preparedStatement = connection.prepareStatement
            (SqlRequest.DELETELESSONID.getNameSqlRequest())) {
        preparedStatement.setInt(1, id);
        return  resultExecutingSql(preparedStatement);
    }
    }
    public List<Lesson> deleteLessonName(String name)throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement
                (SqlRequest.DELETELESSONNAME.getNameSqlRequest())) {
            preparedStatement.setString(1, name);
            return  resultExecutingSql(preparedStatement);
        }
    }

    public List<Lesson> getLessonToID(int idLesson) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement
                (SqlRequest.LESSONID.getNameSqlRequest())) {
            preparedStatement.setInt(1, idLesson);
            resultExecutingSql(preparedStatement);
            return lessons;
        }
    }
    public List<Lesson> getLessonAll() throws SQLException {

        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery
                    (SqlRequest.LESSONALL.getNameSqlRequest())) {
                while (resultSet.next()) {
                    lessons.add((new Lesson(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("homework_id"))));
                }
            }
        }
        return lessons;
    }
    private List<Lesson> resultExecutingSql(PreparedStatement preparedStatement) throws SQLException {
        if (preparedStatement.execute()) {
            try (ResultSet resultSet = preparedStatement.getResultSet()){
                while (resultSet.next()) {
                    lessons.add((new Lesson(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("homework_id"))));
                }
            }
        } else System.out.println("There are no such records in the database");
        return lessons;
    }
    @Override
    public String toString() {
        return "LessonDao{" +
                "lessons=" + lessons +
                '}';
    }
}



