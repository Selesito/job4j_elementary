package ru.job4j.singleton;

public class TrackerThird {
    private static final TrackerThird INSTANCE = new TrackerThird();

    private TrackerThird() {
    }

    public static TrackerThird getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        TrackerThird trackerThird = TrackerThird.getInstance();
    }
}
