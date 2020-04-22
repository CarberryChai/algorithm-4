package chapter_1.exercise;

public class Task_1_3 {
    public static void main(String[] args) {
        int x = parse(args[0]);
        int y = parse(args[1]);
        int z = parse(args[2]);
        if (x == y && y == z) System.out.println("equal!");
        else System.out.println("not equal!");
        // 1.7
        int sum1 = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum1++;
        System.out.println(sum1);

        int sum2 = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < i; j++)
                sum2++;
        System.out.println(sum2);

        // 1.8
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char)('a' + 4));
    }

    public static int parse(String x) {
        return Integer.parseInt(x);
    }
}
