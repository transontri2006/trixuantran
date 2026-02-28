package Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {

    Scanner sc = new Scanner(System.in);
    private int numberOfSeats;
    private String fuelType;

    public Car() {
        super();
    }

    public Car(String id, String brand, String model, double rentalPricePerDay,
            int numberOfSeats, String fuelType) {
        super(id, brand, model, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.print("Enter Number Of Seats: ");
        numberOfSeats = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Fuel Type: ");
        fuelType = sc.nextLine();
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.print("Enter new Number Of Seats: ");
        numberOfSeats = Integer.parseInt(sc.nextLine());
        System.out.print("Enter new Fuel Type: ");
        fuelType = sc.nextLine();
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Car ----");
        System.out.println("ID: " + getId());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Rental Price Per Day: " + getRentalPricePerDay());
        System.out.println("Number Of Seats: " + numberOfSeats);
        System.out.println("Fuel Type: " + fuelType);
    }
}

