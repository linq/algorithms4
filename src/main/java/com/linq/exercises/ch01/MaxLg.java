package com.linq.exercises.ch01;

/**
 * 1.1.14
 *
 * @author LinQ
 * @version 2013-11-24
 */
public class MaxLg {
    public static int lg(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {
            int times = 0;
            while (n / 2 != 0) {
                n /= 2;
                times++;
            }
            return times;
        }


    }

    public static void main(String[] args) {
        System.out.println(lg(255));
    }
}
