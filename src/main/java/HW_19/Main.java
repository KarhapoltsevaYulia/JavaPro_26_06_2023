package HW_19;

import HW_19.dao.LessonDao;
import HW_19.dto.Lesson;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, FileNotFoundException, ClassNotFoundException {

       Class.forName("com.mysql.cj.jdbc.Driver");

        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        dataBaseConnection.beginAccess("prop.txt");
        Connection connection =  dataBaseConnection.getConnection();

        LessonDao lessonDao = new LessonDao(connection);
        lessonDao.addLesson(new Lesson("67",13));
        lessonDao.addLesson(new Lesson("45",13));
        lessonDao.deleteLessonID(39);
        System.out.println(lessonDao.deleteLessonName("67"));
        System.out.println(lessonDao.getLessonToID(55));
        System.out.println(lessonDao.getLessonAll());
        dataBaseConnection.close(connection);
        //lessonDao.deleteLessonID(44);

    }
}
