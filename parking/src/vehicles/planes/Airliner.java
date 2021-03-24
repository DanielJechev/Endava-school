package vehicles.planes;

import util.ColorType;
import vehicles.IVehicle;
import vehicles.Vehicle;

public class Airliner extends Vehicle implements IVehicle {
    private static final String TYPE_AIRLINER = "AIRLINER";
    private static final int numberOfFins = 2;


    public Airliner(String model, int maxSpeed, ColorType color, double price, int tank, int regNumber) {
        super(model, maxSpeed, color, price, tank, regNumber);
    }


    @Override
    public String getType() {
        return TYPE_AIRLINER;
    }
}
