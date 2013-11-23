package com.linq.exercises.ch01;

/**
 * 1.1.1
 * 1.1.2
 * @author LinQ
 * @version 2013-11-23
 */
public class Expressions {

    public static void main(String[] args) {
        first();
        second();
    }

    private static void second() {
        System.out.println((1 + 2.236)/2);
        System.out.println( 1 + 2 + 3 + 4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1 + 2 + "3");
    }

    private static void first() {
        System.out.println((0 + 15) / 2);
        System.out.println( 2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
    }
}
