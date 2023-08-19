package hw_11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Record  extends PhoneDirectory{
    String name;
    List<Long> listTelepfone = new ArrayList();

    public Record() {

    }

    public Record(String name, long telepfone) {
        this.name = name;
        this.listTelepfone.add(telepfone);
    }

    public String getName() {
        return name;
    }
    public List<Long> getListTelepfone() {
        return listTelepfone;
    }

}
