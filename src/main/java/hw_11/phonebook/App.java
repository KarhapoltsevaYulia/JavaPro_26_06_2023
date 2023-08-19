package hw_11.phonebook;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory(){};
        phoneDirectory.userAnswer();
        phoneDirectory.findPrint();
        System.out.println(phoneDirectory.find("Kira"));
        List<String> name = new LinkedList<>();
        name.add("Anna");
        name.add("Slava");
        System.out.println(phoneDirectory.findAll(name));
        phoneDirectory.print();
    }
}
