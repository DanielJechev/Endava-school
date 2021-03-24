package owner;

import util.Validator;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private int personalNumber;
    private double money;
    private List<Vehicle> garage;

    public Person(String name, int age, int personalNumber, double money) {
        if (Validator.isValidField(name)) {
            this.name = name;
        }else {
            Validator.exceptionMessage();
        }
        if (Validator.isValidInput(age)) {
            this.age = age;
        }else {
            Validator.exceptionMessage();
        }
        if (Validator.isValidInput(personalNumber)) {
            this.personalNumber = personalNumber;
        }else {
            Validator.exceptionMessage();
        }
        if (money > 0) {
            this.money = money;
        }else {
            Validator.exceptionMessage();
        }
        this.garage = new ArrayList<>();
    }


    public void showGarage() {
        System.out.print(name + " has in a  garage: ");
        for (int i = 0; i < garage.size(); i++) {
            System.out.print(garage.get(i).getModel() + " ");
            if (i != garage.size() - 1) {
                System.out.print(", ");
            }
        }

    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getGarage() {
        return garage;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
