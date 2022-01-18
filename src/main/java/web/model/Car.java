package web.model;

public class Car {

    private String model;

    private String fuel;

    private String carNumber;

    public Car(String model, String fuel, String carNumber) {
        this.model = model;
        this.fuel = fuel;
        this.carNumber = carNumber;
    }

    public Car() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
