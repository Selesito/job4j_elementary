package test.java.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int start = 0; start < data.length; start++) {
            int min = MinDiapason.findMin(data, start, data.length - 1);
            int index = FindLoop.indexOf(data, min, start, data.length);
            int tmp = data[index];
            data[index] = data[start];
            data[start] = tmp;
        }
        return data;
    }
}
