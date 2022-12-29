package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private String swimmingPoolArea;
    private String numberFloors;

    public Villa() {
    }

    public Villa(String serviceName, String usableArea, String rentalCosts, String maximumNumberPeople, String rentalType, String serviceCode, String roomStandard, String swimmingPoolArea, String numberFloors) {
        super(serviceName, usableArea, rentalCosts, maximumNumberPeople, rentalType, serviceCode);
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

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
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
                "serviceName='" + super.getServiceName() + '\'' +
                ", serviceCode='" + super.getServiceCode() + '\'' +
                ", usableArea='" + super.getUsableArea() + '\'' +
                ", rentalCosts='" + super.getRentalCosts() + '\'' +
                ", maximumNumberPeople='" + super.getMaximumNumberPeople() + '\'' +
                ", rentalType='" + super.getRentalType() + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea='" + swimmingPoolArea + '\'' +
                ", numberFloors='" + numberFloors + '\'' +
                '}';
    }
}
