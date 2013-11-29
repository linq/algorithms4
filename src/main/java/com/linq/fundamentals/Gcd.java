package com.linq.fundamentals;

/**
 * Euclid’s algorithm
 *
 * @author LinQ
 * @version 2013-11-26
 */
public class Gcd {

    public static int gcd(int p, int q) {
        System.out.printf("p:%d, q:%d\n", p, q);
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
