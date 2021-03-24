package vehicles.ships;

import util.ColorType;
import util.Validator;
import vehicles.Vehicle;

public class MilitaryShip extends Vehicle {
    private static final String SHIP = "SHIP";
    private int crew;
    private String guns;

    public MilitaryShip(String model, int maxSpeed, ColorType color, double price, int tank, int crew, String guns) {
        super(model, maxSpeed, color, price, tank);
        if (Validator.isValidInput(crew)) {
            this.crew = crew;
        }else {
            Validator.exceptionMessage();
        }
        if (Validator.isValidField(guns)) {
            this.guns = guns;
        }else {
            Validator.exceptionMessage();
        }
    }


    @Override
    public String getType() {
        return SHIP;
    }
}
