package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String description) {
        this.desc = description;
    }

    public static void main(String[] args) {
        Fix fix = new Fix("Description");
    }
}
