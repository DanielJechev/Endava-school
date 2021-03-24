package vehicles;

import util.ColorType;
import util.Validator;

import java.util.Objects;

public abstract class Vehicle {
    private String model;
    private int maxSpeed;
    private ColorType color;
    private double price;
    private int tank;

    public Vehicle(String model, int maxSpeed, ColorType color, double price, int tank) {
        if (Validator.isValidField(model)) {
            this.model = model;
        }else {
            Validator.exceptionMessage();
        }
        if (Validator.isValidInput(maxSpeed)) {
            this.maxSpeed = maxSpeed;
        }else {
            Validator.exceptionMessage();
        }
        this.color = color;
        if (price > 0) {
            this.price = price;
        }else {
            Validator.exceptionMessage();
        }
        if (Validator.isValidInput(tank)) {
            this.tank = tank;
        }else {
            Validator.exceptionMessage();
        }
    }

    public void isMoreExpensive(Vehicle vehicle) {
        if (vehicle.price > this.price) {
            System.out.println(vehicle.model + " is more expensive.");

        } else {
            System.out.println(this.model + " is more expensive.");
        }
    }


    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public abstract String getType();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.price, price) == 0 && model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

}
