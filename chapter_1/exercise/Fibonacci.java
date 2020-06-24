package chapter_1.exercise;

// task 1.19
public class Fibonacci {
    public static void main(String[] args) {

        /*int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));*/
    }

    public static int F(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return F(N - 1) + F(N - 2);
    }

    // leetcode:
    // https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
    public static void duplicateZeros(int[] arr) {
        int length = arr.length;
        int temp = -1;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                if (i == temp)
                    continue;
                temp = i + 1;
                for (int j = length - 2; j >= temp; j--) {
                    arr[j + 1] = arr[j];
                }
                if (temp != length)
                    arr[temp] = 0;
            }
        }
    }
}
