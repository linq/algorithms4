package com.linq.exercises.ch01;

/**
 * 1.1.9
 *
 * @author LinQ
 * @version 2013-11-23
 */
public class Integer2Binary {

    public static String integer2Binary(int value) {
        String s = "";
        for (int n = value; n > 0; n /= 2) {
            s = (n % 2) + s;
        }

        return s;
    }

    public static void main(String[] args) {
        int value = 8;
        System.out.println(Integer.toBinaryString(value));
        System.out.println(integer2Binary(value));
    }
}
