package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int experience;
    private int office;

    public Surgeon(String name, String surname, String education, int birthday, int experience, int office) {
        super(name, surname, education, birthday);
        this.experience = experience;
        this.office = office;
    }

    public Operation surgery(Pacient pacient) {
        return null;
    }
}
