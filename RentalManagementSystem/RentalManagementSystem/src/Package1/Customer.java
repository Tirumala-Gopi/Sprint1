package Package1;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    private static int nextId = 3000;
    private final int CUSTOMER_ID;
    private String name;
    private String licenseNumber;
    private double balance;
    private List<Vehicle> rentedVehicles;

    public Customer(String name, String licenseNumber) {
        this.CUSTOMER_ID = nextId;
        nextId += 4;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.balance = 0.0;
        this.rentedVehicles = new ArrayList<>();
    }

    // Abstract Method
    public abstract double calculateTotal(int days, double dailyRate);

    // Methods
    public void addVehicle(Vehicle v) {
        rentedVehicles.add(v);
    }

    public void removeVehicle(Vehicle v) {
        rentedVehicles.remove(v);
    }

    // Getters and Setters
    public int getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }

    @Override
    public String toString() {
        return "Customer ID: " + CUSTOMER_ID +
                ", Name: " + name +
                ", License: " + licenseNumber +
                ", Balance: $" + balance +
                ", Rented Vehicles: " + rentedVehicles.size();
    }
}
