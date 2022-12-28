package case_study.models;

public class Customer extends Persion {
    private String customerIsCode;
    private String typeGuest;
    private String address;

    public Customer() {
    }

    public Customer(String name, String dateOfBith, String sex, String idNumber, String phoneNumber, String email, String customerIsCode, String typeGuest, String address) {
        super(name, dateOfBith, sex, idNumber, phoneNumber, email);
        this.customerIsCode = customerIsCode;
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public String getCustomerIsCode() {
        return customerIsCode;
    }

    public void setCustomerIsCode(String customerIsCode) {
        this.customerIsCode = customerIsCode;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerIsCode=" + customerIsCode +
                ", typeGuest='" + typeGuest + '\'' +
                ", address='" + address + '\'' +
                ", name='" + super.getName() + '\'' +
                ", dateOfBith='" + super.getDateOfBith() + '\'' +
                ", sex='" + super.getSex() + '\'' +
                ", idNumber=" + super.getIdNumber() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", email='" + super.getEmail() + '\'' +
                '}';
    }
}
