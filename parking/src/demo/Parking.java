package demo;

import people.Person;
import util.Validator;
import vehicles.IVehicle;


import java.time.LocalTime;

import java.time.temporal.ChronoUnit;

import java.util.*;

public class Parking {
    private static final int freePlaces = 10;
    private static final double taxPerMinute = 0.10;
    private String staff;
    private Map<IVehicle, LocalTime> cars;
    private List<String> tickets;
    private double capital;


    public Parking(String staff) {
        if (Validator.isValidField(staff)) {
            this.staff = staff;
        } else {
            Validator.exceptionMessage();
        }
        this.cars = new HashMap<>(freePlaces);
        tickets = new ArrayList<>(freePlaces);

    }

    public void createTickets() {
        tickets.add("0A");
        tickets.add("1A");
        tickets.add("2A");
        tickets.add("3A");
        tickets.add("4A");
        tickets.add("5A");
        tickets.add("6A");
        tickets.add("7A");
        tickets.add("8A");
        tickets.add("9A");
    }

    public int numOfAvailableSpots() {
        return freePlaces - this.cars.size();
    }

    public void addVehicles(Person p, LocalTime timeOfArrival) {

        if (this.numOfAvailableSpots() > 0) {
            this.cars.put(p.getVehicle(), timeOfArrival);
            p.getVehicle().setTicket(tickets.get(0));
            tickets.remove(0);

            System.out.println("You successfully park your " + p.getVehicle().getType() + ": " + p.getVehicle().getModel() + " on  " + p.getVehicle().getTicket() + " place!");
        } else {
            System.out.println("Sorry,car Park is full !");
        }

    }

    public void removeVehicle(Person p, LocalTime timeOfLeaving) {
        LocalTime timeOfArrival = cars.get(p.getVehicle());
        double minutesStay = ChronoUnit.MINUTES.between(timeOfArrival, timeOfLeaving);

        cars.remove(p.getVehicle());
        tickets.add(0, p.getVehicle().getTicket());
        sortFreePlaces();

        p.getVehicle().setTicket("no available ticket !");
        System.out.println("You must pay for parking: " + calculateFeeForParking(minutesStay) + " leva.");


        p.setMoney(p.getMoney() - calculateFeeForParking(minutesStay));
        capital += calculateFeeForParking(minutesStay);

    }


    public void printParkedVehicleDetails() {

        System.out.println("Show parked vehicles:");
        for (Map.Entry<IVehicle, LocalTime> a : cars.entrySet()) {
            System.out.println(a.getKey().getTicket() + "->" + a.getKey().getModel());
        }


        System.out.println("Free places: ");
        for (int i = 0; i < tickets.size(); i++) {
            System.out.println(tickets.get(i) + " => " + " -----");
        }


    }

    public void sortFreePlaces() {
        Collections.sort(tickets);
    }

    private double calculateFeeForParking(double minutesStay) {
        if (minutesStay <= 0) {
            return 0;
        }
        return minutesStay * taxPerMinute;
    }

    public double getCapital() {
        return capital;
    }

}
