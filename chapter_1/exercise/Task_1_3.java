package chapter_1.exercise;

import java.lang.reflect.Array;
import java.util.*;

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
        System.out.println('b'); // char类型重载，直接调用String.valueOf
        System.out.println('b' + 'c'); // 'b' + 'c' 是两个int类型的计算，返回int
        System.out.println((char) ('a' + 4));

        // 1.9
        int N = 134;
        int weight = 8;
        StringBuilder s = new StringBuilder();
        List<String> list = parseWeight(weight);
        for (int n = N; n > 0; n /= weight) {
            s.insert(0, list.get(n % weight));
        }
        System.out.println(s.toString());

        // 1.11
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int parse(String x) {
        return Integer.parseInt(x);
    }

    public static List<String> parseWeight(int weight) {
        Map map = new HashMap<Integer, ArrayList>();
        map.put(2, generateArr(2));
        map.put(8, generateArr(8));
        map.put(10, generateArr(10));
        map.put(16, generateArr(16));
       return (List<String>) map.get(weight);
    }

    public static List<String> generateArr(int x) {
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            if (i > 9) break;
            arr.add(String.valueOf(i));
        }
        if (x > 10) arr.addAll(Arrays.asList("abcdef".split("")));
        return arr;
    }
}
