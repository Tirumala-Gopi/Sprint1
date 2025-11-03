package Package1;


public class Car extends Vehicle {
    private int seats;
    private boolean automatic;

    public Car(String model, double dailyRate, int seats, boolean automatic) {
        super(model, dailyRate);
        this.seats = seats;
        this.automatic = automatic;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return "Car - ID: " + getVEHICLE_ID() +
                ", Model: " + getModel() +
                ", Seats: " + seats +
                ", Automatic: " + automatic +
                ", Daily Rate: $" + getDailyRate() +
                ", Available: " + isAvailable();
    }
}
