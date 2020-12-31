package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, x = 0;
        while (i < left.length && j < right.length) {
            rsl[x++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            rsl[x++] = left[i++];
        }
        while (j < right.length) {
            rsl[x++] = right[j++];
        }
        return rsl;
    }
}