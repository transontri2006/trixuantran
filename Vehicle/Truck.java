package Vehicle;

import java.util.Scanner;

public class Truck extends Vehicle {

    Scanner sc = new Scanner(System.in);
    private double loadCapacity;
    private double distance;

    public Truck() {
        super();
    }

    public Truck(String id, String brand, String model, double rentalPricePerDay,
            double loadCapacity, double distance) {
        super(id, brand, model, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
        this.distance = distance;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.print("Enter Load Capacity (tons): ");
        loadCapacity = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Distance (km): ");
        distance = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.print("Enter new Load Capacity: ");
        loadCapacity = Double.parseDouble(sc.nextLine());
        System.out.print("Enter new Distance: ");
        distance = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Truck ----");
        System.out.println("ID: " + getId());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Rental Price Per Day: " + getRentalPricePerDay());
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Distance: " + distance + " km");
    }
}
