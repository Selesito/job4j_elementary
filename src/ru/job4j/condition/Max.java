package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int result = max(first, second);
        return result > third ? result : third;
    }

    public static int max(int first, int second, int third, int four) {
        int result = max(first, second, third);
        return result > four ? result : four;
    }
}
