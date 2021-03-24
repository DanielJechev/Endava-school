package people;

import types.UniversityType;
import util.Validator;
import vehicles.bicycle.Bicycle;


public class Student extends Person {
    private UniversityType university;
    private long facNumber;

    public Student(String name, int age, int personalNumber, double money, Bicycle vehicle, UniversityType university, long facNumber) {
        super(name, age, personalNumber, money, vehicle);

        this.university = university;

        if (facNumber > 0) {
            this.facNumber = facNumber;
        } else {
            Validator.exceptionMessage();
        }
    }
}
