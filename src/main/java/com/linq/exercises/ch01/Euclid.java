package com.linq.exercises.ch01;

import com.linq.fundamentals.Gcd;

/**
 * 1.1.24
 *
 * @author LinQ
 * @version 2013-11-26
 */
public class Euclid {

    public static void main(String[] args) {
        assert args.length == 2;
        int gcd = Gcd.gcd(105, 24);
        System.out.println(gcd);
        gcd = Gcd.gcd(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        System.out.println(gcd);
    }
}
