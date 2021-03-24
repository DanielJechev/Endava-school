package vehicles.ships;

import util.ColorType;
import util.Validator;
import vehicles.Vehicle;

public class TradeShip extends Vehicle {
    private static final String SHIP = "SHIP";
    private long capacity;

    public TradeShip(String model, int maxSpeed, ColorType color, double price, int tank, long capacity) {
        super(model, maxSpeed, color, price, tank);
        if (capacity > 0) {
            this.capacity = capacity;
        }else {
            Validator.exceptionMessage();
        }
    }

    @Override
    public String getType() {
        return SHIP;
    }
}
