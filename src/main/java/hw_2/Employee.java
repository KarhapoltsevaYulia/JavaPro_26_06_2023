package hw_2;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int age;
    public Employee(String fullName, String position, String email, String phone, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }
    public String getPosition() {
        return position;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }
}