package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int years;

    public Engineer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Engineer(String name, String surname, String education, int birthday, int years) {
        super(name, surname, education, birthday);
        this.years = years;
    }

    public Controling job(Workman workman) {
        return null;
    }
}
