package ru.job4j.inheritance;

public class Mechanic extends Engineer {

    public Mechanic(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Renovation repair(Car car) {
        return null;
    }
}
