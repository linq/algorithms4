package com.linq.exercises.ch01;

/**
 * 1.1.20
 *
 * @author LinQ
 * @version 2013-11-25
 */
public class LnValue {
    public static double ln(int n) {
        int result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return Math.log(result);
    }

    public static double ln2(int n) {
        return Math.log(cal(n));
    }

    private static double cal(int n) {
        if (n == 0) {
            return 1;
        }
        return n * cal(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(ln(4));
        System.out.println(ln2(4));
    }
}
