package ru.job4j.tracker;

public class Item {
    int id;
    String name;

    public Item() {
    }

    public Item(int value) {
        this.id = value;
    }

    public Item(int value, String name) {
        this.id = value;
        this.name = name;
    }
}
