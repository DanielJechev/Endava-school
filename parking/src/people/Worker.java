package people;

import types.JobType;
import vehicles.cars.Jeep;


public class Worker extends Person {
    private JobType job;

    public Worker(String name, int age, int personalNumber, double money, Jeep vehicle, JobType job) {
        super(name, age, personalNumber, money, vehicle);
        this.job = job;
    }
}
