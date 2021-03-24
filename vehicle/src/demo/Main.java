package demo;

import owner.Person;
import util.ColorType;
import util.Randomizator;
import vehicles.Vehicle;
import vehicles.cars.Bus;
import vehicles.cars.Jeep;
import vehicles.planes.Airliner;
import vehicles.planes.BomberPlane;
import vehicles.ships.MilitaryShip;
import vehicles.ships.TradeShip;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double personMoney = 11000 + 1000000 * new Random().nextDouble();
        Person person = new Person("Ivan", 21, 983, personMoney);
        ShowRoom showRoom = new ShowRoom("George", person);

        for (int i = 0; i < 10; i++) {
            Vehicle v;
            int chance = new Random().nextInt(3 - 1 + 1) + 1;
            String jeepModels = Randomizator.randomJeepModels();
            String busModels = Randomizator.randomBusModels();
            int maxSpeedOfCars = Randomizator.random(180, 300);
            int pick = new Random().nextInt(ColorType.values().length);
            ColorType color = ColorType.values()[pick];
            double price = 2000 + 300000 * new Random().nextDouble();
            int tank = Randomizator.random(40, 300);
            int numberOfSeats = Randomizator.random(10, 40);
            long placeForLuggage = Randomizator.random(10, 100);
            boolean isSportCar = new Random().nextBoolean() ? true : false;

            int knots = Randomizator.random(4, 30);
            int crew = Randomizator.random(2, 20);
            int shipOrPlaneTank = Randomizator.random(1000, 10000);
            int capacityOfShip = Randomizator.random(100, 3000);
            int planeSpeed = Randomizator.random(100, 500);

            String guns = Randomizator.randomGuns();
            String military = Randomizator.randomMilitaryShips();
            String tradeShips = Randomizator.randomTradeShips();
            String airplaneModel = Randomizator.randomAirplane();
            String bomberModel = Randomizator.randomBomber();

            switch (chance) {
                case 1:
                    v = new Random().nextBoolean() ? new Bus(busModels, maxSpeedOfCars, color, price, tank, numberOfSeats, placeForLuggage) :
                            new Jeep(jeepModels, maxSpeedOfCars, color, price, tank, isSportCar);
                    showRoom.addVehicle(v);
                    showRoom.sellVehicle(v);
                    break;
                case 2:
                    v = new Random().nextBoolean() ? new TradeShip(tradeShips, knots, color, price, shipOrPlaneTank, capacityOfShip) :
                            new MilitaryShip(military, knots, color, price, shipOrPlaneTank, crew, guns);

                    showRoom.addVehicle(v);
                    showRoom.sellVehicle(v);
                    break;
                case 3:
                    v = new Random().nextBoolean() ? new Airliner(airplaneModel, planeSpeed, color, price, shipOrPlaneTank) :
                            new BomberPlane(bomberModel, planeSpeed, color, price, shipOrPlaneTank, crew);
                    showRoom.addVehicle(v);
                    showRoom.sellVehicle(v);
                    break;

            }
        }

        System.out.println("After sales in the store there are:");
        showRoom.showVehiclesByCategory();
        System.out.println("Тhe store has a budget of " + showRoom.getBudget() + " leva after sales.");
        System.out.println();
        person.showGarage();
        showRoom.showAllVehiclesByPrice();

    }
}
