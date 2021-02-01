package ru.job4j.singleton;

public class TrackerTwo {
    private static TrackerTwo instance;

    private TrackerTwo() {
    }

    public static TrackerTwo getInstance() {
        if (instance == null) {
            instance = new TrackerTwo();
        }
        return instance;
    }

    public static void main(String[] args) {
        TrackerTwo trackerTwo = TrackerTwo.getInstance();
    }
}
