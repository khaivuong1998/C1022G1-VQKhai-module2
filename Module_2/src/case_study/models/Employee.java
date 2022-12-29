package case_study.models;

public class Employee extends Persion{
    private String employeeCode;
    private String level;
    private String position;
    private String wage;

    public Employee() {
    }

    public Employee(String name, String dateOfBith, String sex, String idNumber, String phoneNumber, String email, String employeeCode, String level, String position, String wage) {
        super(name, dateOfBith, sex, idNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", dateOfBith='" + super.getDateOfBith() + '\'' +
                ", sex='" + super.getSex() + '\'' +
                ", idNumber='" + super.getIdNumber() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}
