package vehicles.planes;

import util.ColorType;
import vehicles.Vehicle;

public class Airliner extends Vehicle {
    private static final int numberOfFins = 2;
    private static final String PLANE = "PLANE";

    public Airliner(String model, int maxSpeed, ColorType color, double price, int tank) {
        super(model, maxSpeed, color, price, tank);

    }

    @Override
    public String getType() {
        return PLANE;
    }


}
