package chapter_1.main;

import edu.princeton.cs.algs4.StdIn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(args[0])); //   System.in 为final
        int[] whitelist = StdIn.readAllInts();
        Arrays.sort(whitelist);
        Scanner scanner = new Scanner(new FileInputStream(args[1]));
        while (scanner.hasNext()) {
            int key = scanner.nextInt();
            if (indexOf(key, whitelist) < 0) {
                System.out.println(key);
            }
        }
        scanner.close();
    }

    public static int indexOf(int key, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key < arr[mid]) end = mid - 1;
            else if (key > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
