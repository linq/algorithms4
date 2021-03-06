package com.linq.exercises.ch01;

/**
 * 1.1.6
 * 1.1.8
 * 1.1.12
 *
 * @author LinQ
 * @version 2013-11-23
 */
public class WhatPrint {

    public static void what() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }

    public static void what2() {
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char)('a' + 4));
    }

    public static void what3() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        what();
        what2();
        what3();
    }
}
