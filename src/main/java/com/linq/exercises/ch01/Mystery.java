package com.linq.exercises.ch01;

/**
 * 1.1.18
 *
 * @author LinQ
 * @version 2013-11-24
 */
public class Mystery {
    public static int mystery(int a, int b) {
        System.out.printf("a:%d, b:%d\n", a, b);
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        }
        return mystery(a + a, b / 2) + a;
    }

    public static int mystery2(int a, int b) {
        System.out.printf("a:%d, b:%d\n", a, b);
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a * a, b / 2);
        }
        return mystery(a * a, b / 2) + a;
    }

    public static void main(String[] args) {
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));
        System.out.println(mystery2(2, 25));
        System.out.println(mystery2(3, 11));
    }
}
