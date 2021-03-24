package vehicles.cars;

import util.ColorType;
import vehicles.Vehicle;

public class Jeep extends Vehicle {
    private static final String CAR = "CAR";
    private boolean isSportCar;

    public Jeep(String model, int maxSpeed, ColorType color, double price, int tank, boolean isSportCar) {
        super(model, maxSpeed, color, price, tank);
        this.isSportCar = isSportCar;
    }

    public void driveOffRoad() {
        if (isSportCar) {
            System.out.println(getModel() + "is not for off road.It is dangerous");
        } else {
            System.out.println("Go on off road.");
        }
    }

    @Override
    public String getType() {
        return CAR;
    }
}
