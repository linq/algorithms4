package com.linq.exercises.ch01;

/**
 * 1.1.16
 *
 * @author LinQ
 * @version 2013-11-24
 */
public class Exr {
    public static String exr1(int n) {
        if (n <= 0) {
            return "";
        }
        return exr1(n - 3) + n + exr1(n - 2) + n;
    }

    public static void main(String[] args) {
        System.out.println(exr1(6));
    }
}
