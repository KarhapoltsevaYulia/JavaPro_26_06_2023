package Hw_22.DB.Dto;

public class RecordTable {
    int id;
    String data;

    public RecordTable(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

}
