package demo;

import people.RichPerson;
import people.Student;
import people.Person;
import people.Worker;
import types.HobbyType;
import types.JobType;
import types.UniversityType;
import util.ColorType;
import vehicles.bicycle.Bicycle;
import vehicles.cars.Jeep;
import vehicles.planes.Airliner;


import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking("Stamat");
        parking.createTickets();

        Person ivan = new Student("Ivan", 31, 99, 12000,
                new Bicycle("BMW ", 12, ColorType.BLUE, 121, 12, 123, 1),
                UniversityType.TY, 5012);
        Person petar = new Student("Petar", 12, 1299, 10000,
                new Bicycle("Audi ", 10, ColorType.GREEN, 210, 12, 120, 1),
                UniversityType.BSU, 5012);

        Person dani = new RichPerson("Dani", 32, 1299332, 10000000,
                new Airliner("F-16 ", 1000, ColorType.GREEN, 122210, 1222, 12033),
                HobbyType.Football);

        Person mariq = new RichPerson("Mariq", 22, 12399, 12324353,
                new Jeep("BMW X5 ", 800, ColorType.GREEN, 2103132, 102, 132120, true),
                HobbyType.VolleyBall);

        Person gabi = new Worker("Gabi", 42, 1239931, 120242,
                new Jeep("Audi Q7 ", 260, ColorType.BLUE, 22220, 122, 3213220, true),
                JobType.ACCOUNTANT);

        Person mimi = new Worker("Mimi", 32, 1232499, 10242,
                new Jeep("Audi Q1 ", 220, ColorType.PINK, 22210, 122, 13220, true),
                JobType.WEB);

        parking.addVehicles(ivan, LocalTime.of(8, 0));
        parking.addVehicles(petar, LocalTime.of(2, 0));
        parking.addVehicles(dani, LocalTime.of(1, 3));
        parking.addVehicles(mariq, LocalTime.of(8, 33));
        parking.addVehicles(gabi, LocalTime.of(3, 42));
        parking.addVehicles(mimi, LocalTime.of(0, 23));


        parking.removeVehicle(ivan, LocalTime.now());
        parking.removeVehicle(dani, LocalTime.now());
        parking.removeVehicle(mariq, LocalTime.now());
        parking.addVehicles(mariq, LocalTime.of(4, 33));
        parking.printParkedVehicleDetails();

    }

}
