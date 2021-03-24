package vehicles.bicycle;

import util.ColorType;
import util.Validator;
import vehicles.Vehicle;

public class Bicycle extends Vehicle {
    private static final String TYPE_BIKE = "BIKE";
    private long capacity;

    public Bicycle(String model, int maxSpeed, ColorType color, double price, int tank, int regNumber, long capacity) {
        super(model, maxSpeed, color, price, tank, regNumber);
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            Validator.exceptionMessage();
        }
    }


    @Override
    public String getType() {
        return TYPE_BIKE;
    }
}
