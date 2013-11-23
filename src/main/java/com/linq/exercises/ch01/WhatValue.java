package com.linq.exercises.ch01;

/**
 * 1.1.7
 *
 * @author LinQ
 * @version 2013-11-23
 */
public class WhatValue {
    public static void what1() {
        double t = 9.0;
        while (Math.abs(t - 9.0) > 0.01) {
            t = (9.0/t + t) / 2.0;
        }

        System.out.printf("%.5f\n", t);
    }

    public static void what2() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }

        System.out.println(sum);
    }

    public static void what3() {
        int sum = 0;
        for (int i = 1; i < 1000; i*=2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        what1();
        what2();
        what3();
    }
}
