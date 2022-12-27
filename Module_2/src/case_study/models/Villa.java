package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private double swimmingPoolArea;
    private String numberFloors;

    public Villa() {
    }

    public Villa(String service, String usableArea, String rentalCosts, String maximumNumberPeople, String rentalType, String roomStandard, double swimmingPoolArea, String numberFloors) {
        super(service, usableArea, rentalCosts, maximumNumberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberFloors=" + numberFloors +
                "service='" + super.getService() +
                ", usableArea=" + super.getUsableArea() +
                ", rentalCosts=" + super.getRentalCosts() +
                ", maximumNumberPeople=" + super.getMaximumNumberPeople() +
                ", rentalType=" + super.getRentalType() +
                '}';
    }
}
