package vehicles.planes;

import util.ColorType;
import util.Validator;
import vehicles.Vehicle;

public class BomberPlane extends Vehicle {
    private static final String PLANE = "PLANE";
    private int crew;

    public BomberPlane(String model, int maxSpeed, ColorType color, double price, int tank, int crew) {
        super(model, maxSpeed, color, price, tank);
        if (Validator.isValidInput(crew)) {
            this.crew = crew;
        }else {
            Validator.exceptionMessage();
        }
    }

    @Override
    public String getType() {
        return PLANE;
    }
}
