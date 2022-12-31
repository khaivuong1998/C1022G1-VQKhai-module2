package case_study.models;

public abstract class Persion {
    private String name;
    private String dateOfBith;
    private String sex;
    private String idNumber;
    private String phoneNumber;
    private String email;

    protected Persion() {
    }

    protected Persion(String name, String dateOfBith, String sex, String idNumber, String phoneNumber, String email) {
        this.name = name;
        this.dateOfBith = dateOfBith;
        this.sex = sex;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBith() {
        return dateOfBith;
    }

    public void setDateOfBith(String dateOfBith) {
        this.dateOfBith = dateOfBith;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", dateOfBith='" + dateOfBith + '\'' +
                ", sex='" + sex + '\'' +
                ", idNumber=" + idNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public String toCSV() {
        return this.name + "," + this.dateOfBith + "," + this.sex + "," + this.idNumber + "," +
                this.phoneNumber + "," + this.email;
    }
}
