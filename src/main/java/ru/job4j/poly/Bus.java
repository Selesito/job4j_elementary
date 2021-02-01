package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void travel() {
        System.out.print("Автобус отправится по маршруту - Дорога смерти в 19:00");
    }

    @Override
    public void passeger(int count) {
        System.out.println("Количество пассажиров в автобусе - " + count);
    }

    @Override
    public double refuel(double fuel) {
        double price = fuel * 47.5;
        return price;
    }
}
