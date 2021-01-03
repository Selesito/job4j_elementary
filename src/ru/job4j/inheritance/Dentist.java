package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int experience;

    public Dentist(String name, String surname, String education, int birthday, int experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public Dentistry dentist(Pacient pacient) {
        return null;
    }
}
