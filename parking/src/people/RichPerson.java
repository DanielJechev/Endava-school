package people;

import types.HobbyType;

import vehicles.IVehicle;


public class RichPerson extends Person {
    private HobbyType hobby;

    public RichPerson(String name, int age, int personalNumber, double money, IVehicle vehicle, HobbyType hobby) {
        super(name, age, personalNumber, money, vehicle);

        this.hobby = hobby;


    }
}
