package Package1;

public class Truck extends Vehicle {
    private double cargoCapacity; // in tons

    public Truck(String model, double dailyRate, double cargoCapacity) {
        super(model, dailyRate);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Truck - ID: " + getVEHICLE_ID() +
                ", Model: " + getModel() +
                ", Capacity: " + cargoCapacity + " tons" +
                ", Daily Rate: $" + getDailyRate() +
                ", Available: " + isAvailable();
    }
}
