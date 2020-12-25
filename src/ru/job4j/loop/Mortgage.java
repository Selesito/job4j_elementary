package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (true) {
            year++;
            amount = (int) (amount + (amount * (percent / 100)));
            amount -= salary;
            if (amount < 0) {
                break;
            }
        }
        return year;
    }
}
