package ru.job4j.singleton;

public class TrackerFour {
    private TrackerFour() {
    }

    public static TrackerFour getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerFour INSTANCE = new TrackerFour();
    }

    public static void main(String[] args) {
        TrackerFour tracker = TrackerFour.getInstance();
    }
}

