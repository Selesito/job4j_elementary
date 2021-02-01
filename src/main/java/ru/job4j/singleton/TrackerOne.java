package ru.job4j.singleton;

public enum  TrackerOne {
    INSTANCE;

    public static void main(String[] args) {
        TrackerOne trackerOne = TrackerOne.INSTANCE;
    }
}
