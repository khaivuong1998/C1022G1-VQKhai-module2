package case_study.models;

public abstract class Facility {
    private String service;
    private String usableArea;
    private String rentalCosts;
    private String maximumNumberPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String service, String usableArea, String rentalCosts, String maximumNumberPeople, String rentalType) {
        this.service = service;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumNumberPeople = maximumNumberPeople;
        this.rentalType = rentalType;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaximumNumberPeople() {
        return maximumNumberPeople;
    }

    public void setMaximumNumberPeople(String maximumNumberPeople) {
        this.maximumNumberPeople = maximumNumberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "service='" + service + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumNumberPeople=" + maximumNumberPeople +
                ", rentalType=" + rentalType +
                '}';
    }
}
