package chapter_1.exercise;

import java.util.Arrays;

public class Counter {
    private String name;
    private int total;

    Counter(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.binarySearch(arr, 90));
    }

    public void increase() {
        this.total += 1;
    }

    public int tally() {
        return this.total;
    }

    public String toString() {
        return this.name + " " + this.total;
    }
}