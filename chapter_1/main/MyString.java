package chapter_1.main;

import java.util.Arrays;

public class MyString {
    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N / 2; i++) {
            if (s.charAt(i) != s.charAt(N - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "abcdcba";
        String b = "abcdefg";
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
        System.out.println("**********************************************");
        System.out.println(isSorted(a));
        System.out.println(isSorted(b));
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
}
