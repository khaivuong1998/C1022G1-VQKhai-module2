package case_study.models;

public abstract class Facility {
    private String service;
    private String usableSrea;
    private String rentalCosts;
    private String maximumNumberPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String service, String usableSrea, String rentalCosts, String maximumNumberPeople, String keiuThue) {
        this.service = service;
        this.usableSrea = usableSrea;
        this.rentalCosts = rentalCosts;
        this.maximumNumberPeople = maximumNumberPeople;
        this.rentalType = keiuThue;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getUsableSrea() {
        return usableSrea;
    }

    public void setUsableSrea(String usableSrea) {
        this.usableSrea = usableSrea;
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
                ", usableSrea=" + usableSrea +
                ", rentalCosts=" + rentalCosts +
                ", maximumNumberPeople=" + maximumNumberPeople +
                ", rentalType=" + rentalType +
                '}';
    }
}
