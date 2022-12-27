package case_study.models;

public class Room extends Facility{
    private String FreeServiceIncluded;

    public Room() {
    }

    public Room(String service, String usableArea, String rentalCosts, String maximumNumberPeople, String rentalType, String FreeServiceIncluded) {
        super(service, usableArea, rentalCosts, maximumNumberPeople, rentalType);
        this.FreeServiceIncluded = FreeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return FreeServiceIncluded;
    }

    public void setFreeServiceIncluded(String FreeServiceIncluded) {
        this.FreeServiceIncluded = FreeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "FreeServiceIncluded='" + FreeServiceIncluded + '\'' +
                "service='" + super.getservice() +
                ", usableArea=" + super.getusableArea() +
                ", rentalCosts=" + super.getrentalCosts() +
                ", maximumNumberPeople=" + super.getmaximumNumberPeople() +
                ", kieuThue=" + super.getKieuThue() +
                '}';
    }
}
