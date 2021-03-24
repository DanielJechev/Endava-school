package vehicles.cars;

import util.ColorType;
import util.Validator;
import vehicles.Vehicle;

public class Bus extends Vehicle {
    private static final String CAR = "CAR";
    private int numberOfSeats;
    private long placeForLuggage;

    public Bus(String model, int maxSpeed, ColorType color, double price, int tank, int numberOfSeats, long placeForLuggage) {
        super(model, maxSpeed, color, price, tank);
        if (Validator.isValidInput(numberOfSeats)) {
            this.numberOfSeats = numberOfSeats;
        }else {
            Validator.exceptionMessage();
        }
        if (placeForLuggage > 0) {
            this.placeForLuggage = placeForLuggage;
        }else {
            Validator.exceptionMessage();
        }
    }


    public void driveOffRoad() {
        System.out.println("It is a bus, you cannot drive off road.");
    }

    @Override
    public String getType() {
        return CAR;
    }
}
