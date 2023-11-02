package HW_19.dto;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Lesson {
    int id;
    String name;
    int homework;

    public Lesson(String name, int homework) {
        this.name = name;
        this.homework = homework;
    }

    public Lesson(int id, String name, int homework) {
        this.id = id;
        this.name = name;
        this.homework = homework;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHomework() {
        return homework;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homework=" + homework +
                '}';
    }
}
