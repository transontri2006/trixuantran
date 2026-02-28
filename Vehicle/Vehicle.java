package Vehicle;

import java.util.Scanner;

public abstract class Vehicle implements IVehicle {
    private String id;
    private String brand;
    private String model;
    private double rentalPricePerDay;

    private Scanner sc = new Scanner(System.in);

    public Vehicle() {
    }

    public Vehicle(String id, String brand, String model, double rentalPricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    @Override
    public void addVehicle() {
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Rental Price Per Day: ");
        rentalPricePerDay = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void updateVehicle() {
        System.out.print("Enter new Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter new Model: ");
        model = sc.nextLine();
        System.out.print("Enter new Rental Price Per Day: ");
        rentalPricePerDay = Double.parseDouble(sc.nextLine());
    }
}

