package vehicles.cars;

import util.ColorType;
import vehicles.IVehicle;
import vehicles.Vehicle;

public class Jeep extends Vehicle implements IVehicle {
    private static final String TYPE_JEEP = "JEEP";
    private boolean isSportCar;

    public Jeep(String model, int maxSpeed, ColorType color, double price, int tank, int regNumber, boolean isSportCar) {
        super(model, maxSpeed, color, price, tank, regNumber);
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
        return TYPE_JEEP;
    }
}
