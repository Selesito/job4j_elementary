package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle air = new Airplane();
        Vehicle train = new Train();
        Vehicle truck = new Truck();
        Vehicle[] vehicles = new Vehicle[]{air, train, truck};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
