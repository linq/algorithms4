package com.linq.exercises.ch01;

/**
 * 1.1.19
 *
 * @author LinQ
 * @version 2013-11-25
 */
public class Fibonacci {
    @SuppressWarnings("unused")
    public static long fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static long fib2(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int a = 1;
        int b = 1;
        for (int i = 2; i < n-1; i++) {
            b = a + b;
            a = b - a;
        }

        return a + b;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + fib2(i));
        }
    }
}
