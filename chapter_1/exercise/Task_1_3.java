package chapter_1.exercise;

public class Task_1_3 {
    public static void main(String[] args) {
        int x = parse(args[0]);
        int y = parse(args[1]);
        int z = parse(args[2]);
        if (x == y && y == z) System.out.println("equal!");
        else System.out.println("not equal!");
    }

    public static int parse(String x) {
        return Integer.parseInt(x);
    }
}
