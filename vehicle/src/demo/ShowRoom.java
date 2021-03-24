package demo;

import owner.Person;
import util.Validator;
import vehicles.Vehicle;

import java.util.*;

public class ShowRoom {
    private String seller;
    private Person client;
    private Set<Vehicle> vehicles;
    private Map<String, Set<Vehicle>> categories;
    private double budget;

    public ShowRoom(String seller, Person client) {
        if (Validator.isValidField(seller)) {
            this.seller = seller;
        }else {
            Validator.exceptionMessage();
        }
        this.client = client;
        vehicles = new HashSet<>();
        categories = new HashMap<>();
        this.budget = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void showVehiclesByCategory() {
        for (Vehicle v : vehicles) {
            if (!categories.containsKey(v.getType())) {
                categories.put(v.getType(), new HashSet<>());
            }
            categories.get(v.getType()).add(v);
        }

        for (Map.Entry<String, Set<Vehicle>> out : categories.entrySet()) {
            for (Vehicle v : out.getValue()) {
                System.out.println(out.getKey() + " => " + v.getModel());

            }

        }
        System.out.println();
    }

    public void sellVehicle(Vehicle vehicle) {
        if (client.getMoney() >= vehicle.getPrice() && vehicles.contains(vehicle)) {
            client.setMoney(client.getMoney() - vehicle.getPrice());
            budget += vehicle.getPrice();
            System.out.println(client.getName() + " can buy this vehicle after this purchase, " + client.getName() + " will have : " + client.getMoney() + " money.");
            client.getGarage().add(vehicle);
            vehicles.remove(vehicle);
        } else {
            System.out.println("Sorry " + client.getName() + " -can't afford this vehicle." + client.getName() + " doesn't have enough money.");
        }
        System.out.println();
    }

    public void showAllVehiclesByPrice() {
        Set<Vehicle> sortedVehicles = new TreeSet<>((a1, a2) -> Double.compare(a1.getPrice(), a2.getPrice()));
        sortedVehicles.addAll(vehicles);
        System.out.println();
        System.out.println("Vehicles by price:");
        for (Vehicle v : sortedVehicles) {
            System.out.printf("%s -> %.2f leva. %n", v.getModel(), v.getPrice());
        }
    }

    public double getBudget() {
        return budget;
    }
}
