package case_study.models;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String service, String usableArea, String rentalCosts, String maximumNumberPeople, String rentalType, String FreeServiceIncluded) {
        super(service, usableArea, rentalCosts, maximumNumberPeople, rentalType);
        this.freeServiceIncluded = FreeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String FreeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "FreeServiceIncluded='" + freeServiceIncluded + '\'' +
                "service='" + super.getService() +
                ", usableArea=" + super.getUsableArea() +
                ", rentalCosts=" + super.getRentalCosts() +
                ", maximumNumberPeople=" + super.getMaximumNumberPeople() +
                ", rentalType=" + super.getRentalType()+
                '}';
    }
}
