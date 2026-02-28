package Vehicle;

import java.util.ArrayList;

public class VehicleList {

    private ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public boolean updateVehicleById(String id) {
        for (Vehicle v : vehicleList) {
            if (v.getId().equalsIgnoreCase(id)) {
                v.updateVehicle();
                return true;
            }
        }
        return false;
    }

    public boolean deleteVehicleById(String id) {
        for (Vehicle v : vehicleList) {
            if (v.getId().equalsIgnoreCase(id)) {
                vehicleList.remove(v);
                return true;
            }
        }
        return false;
    }

    public void findVehicleById(String id) {
        for (Vehicle v : vehicleList) {
            if (v.getId().equalsIgnoreCase(id)) {
                v.displayDetails();
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    public void displayAllVehicles() {
        if (vehicleList.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        for (Vehicle v : vehicleList) {
            v.displayDetails();
            System.out.println();
        }
    }
}
