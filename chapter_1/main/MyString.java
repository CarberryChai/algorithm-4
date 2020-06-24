package chapter_1.main;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class MyString {
    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N / 2; i++) {
            if (s.charAt(i) != s.charAt(N - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
       /* String a = "abcdcba";
        String b = "abcdefg";
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
        System.out.println("**********************************************");
        System.out.println(isSorted(a));
        System.out.println(isSorted(b));
        System.out.println("**********************************************");
        System.out.println(reverse(a).equals(a));*/
        ArrayList arrayList = new ArrayList<>();
       arrayList.add(123);
       arrayList.add("hello");
       arrayList.add(true);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static boolean isSorted(String s) {
        String[] strs = s.split("");
        for (int i = 1; i < strs.length; i++) {
            if (strs[i - 1].compareTo(strs[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static String reverse(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return reverse(b) + reverse(a);
    }
}
