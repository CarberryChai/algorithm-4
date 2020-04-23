package chapter_1.exercise;

// task 1.19
public class Fibonacci {
    public static void main(String[] args) {
        for (int N = 0; N < 10; N++) {
            System.out.println(N + " " + F(N));
        }
    }

    public static int F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }
}
