package HW_19;

public enum SqlRequest {
    ADDLESSON("INSERT INTO Lesson (id,name,homework_id) values (?,?,?);"),
    DELETELESSONID("delete from Lesson  where (id=?);"),
    DELETELESSONNAME("delete from Lesson  where (name=?);"),
    LESSONID("SELECT * from Lesson where id=?; "),
    LESSONALL("SELECT * FROM Lesson");
    private final String nameSqlRequest;

    SqlRequest(String nameSqlRequest) {
        this.nameSqlRequest = nameSqlRequest;
    }

    public String getNameSqlRequest() {
        return nameSqlRequest;
    }

    @Override
    public String toString() {
        return "SQLrequest{" +
                "nameSqlRequest='" + nameSqlRequest + '\'' +
                '}';
    }
}
