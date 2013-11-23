package com.linq.exercises.ch01;

/**
 * 1.1.3
 *
 * @author LinQ
 * @version 2013-11-23
 */
public class BetweenOne {

    static boolean betweenOne(double x, double y) {
        return (x >= 0 && x <= 1) && (y >= 0 && y <= 1);
    }

    public static void main(String[] args) {
        System.out.println(betweenOne(0.5, 0.1));
    }
}
