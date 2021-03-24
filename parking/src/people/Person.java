package people;

import util.Validator;
import vehicles.IVehicle;


public abstract class Person {
    private String name;
    private int age;
    private int personalNumber;
    private double money;
    private IVehicle vehicle;


    public Person(String name, int age, int personalNumber, double money, IVehicle vehicle) {
        if (Validator.isValidField(name)) {
            this.name = name;
        } else {
            Validator.exceptionMessage();
        }
        if (Validator.isValidInput(age)) {
            this.age = age;
        } else {
            Validator.exceptionMessage();
        }
        if (Validator.isValidInput(personalNumber)) {
            this.personalNumber = personalNumber;
        } else {
            Validator.exceptionMessage();
        }
        if (money > 0) {
            this.money = money;
        } else {
            Validator.exceptionMessage();
        }

        this.vehicle = vehicle;

    }


    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }


    public void setMoney(double money) {
        this.money = money;
    }

    public IVehicle getVehicle() {
        return vehicle;
    }


}
