package test.java.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            year++;
            amount = (int) (amount + (amount * (percent / 100)));
            amount -= salary;
        }
        return year;
    }
}
