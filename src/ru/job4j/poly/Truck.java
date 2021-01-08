package ru.job4j.poly;

public class Truck implements Vehicle {
    @Override
    public void move() {
        System.out.println("Грузовик передвигается по дорогам общего пользования!");
    }
}
