package test.java.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second) {
            result = second;
            if (result < third) {
                result = third;
            }
        } else if (first < third) {
            result = third;
        }
        return result;
    }
}
