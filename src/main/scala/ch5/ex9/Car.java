package ch5.ex9;

public class Car {
    private String manufacturer;
    private String model;
    private int productionYear = -1;
    private String registrationNumber = "";

    Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    Car(String manufacturer, String model, int productionYear) {
        this(manufacturer, model);
        this.productionYear = productionYear;
    }

    Car(String manufacturer, String model, String registrationNumber) {
        this(manufacturer, model);
        this.registrationNumber = registrationNumber;
    }

    Car(String manufacturer, String model, int productionYear, String registrationNumber) {
        this(manufacturer, model);
        this.productionYear = productionYear;
        this.registrationNumber = registrationNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
