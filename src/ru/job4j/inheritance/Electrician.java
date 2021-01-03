package ru.job4j.inheritance;

public class Electrician extends Engineer {
    private boolean admission;

    public Electrician(String name, String surname, String education, int birthday, boolean admission) {
        super(name, surname, education, birthday);
        this.admission = admission;
    }

    public Repair upkeep(Generator generator) {
        return null;
    }
}
