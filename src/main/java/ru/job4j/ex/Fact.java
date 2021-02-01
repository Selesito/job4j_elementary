package test.java.ex;

public class Fact {
    public static void main(String[] args) {

    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The argument must be greater than 0");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}