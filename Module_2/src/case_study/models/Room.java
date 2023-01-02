package case_study.models;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceName, String usableArea, String rentalCosts, String maximumNumberPeople,
                String rentalType, String serviceCode, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCosts, maximumNumberPeople, rentalType, serviceCode);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceCode='" + super.getServiceCode() + '\'' +
                ", serviceName='" + super.getServiceName() + '\'' +
                ", usableArea='" + super.getUsableArea() + '\'' +
                ", rentalCosts='" + super.getRentalCosts() + '\'' +
                ", maximumNumberPeople='" + super.getMaximumNumberPeople() + '\'' +
                ", rentalType='" + super.getRentalType() + '\'' +
                ", freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.freeServiceIncluded;
    }
}
