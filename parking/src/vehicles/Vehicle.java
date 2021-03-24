package vehicles;

import util.ColorType;
import util.Validator;

import java.util.Objects;

public abstract class Vehicle implements IVehicle {
    private String model;
    private int maxSpeed;
    private ColorType color;
    private double price;
    private int tank;
    private int regNumber;
    private String ticket = "no available ticket";

    public Vehicle(String model, int maxSpeed, ColorType color, double price, int tank, int regNumber) {
        if (Validator.isValidField(model)) {
            this.model = model;
        } else {
            Validator.exceptionMessage();
        }
        if (Validator.isValidInput(maxSpeed)) {
            this.maxSpeed = maxSpeed;
        } else {
            Validator.exceptionMessage();
        }
        this.color = color;
        if (price > 0) {
            this.price = price;
        } else {
            Validator.exceptionMessage();
        }
        if (Validator.isValidInput(tank)) {
            this.tank = tank;
        } else {
            Validator.exceptionMessage();
        }
        if (Validator.isValidInput(regNumber)) {
            this.regNumber = regNumber;
        } else {
            Validator.exceptionMessage();
        }
    }


    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }


    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return regNumber == vehicle.regNumber && model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, regNumber);
    }


}
