package com.linq.exercises.ch01;

/**
 * 1.1.3
 *
 * @author LinQ
 * @version 2013-11-23
 */
public class EqualsOrNot {

    static boolean isEquals(int first, int second, int third) {
        return first == second && second == third;

    }

    public static void main(String[] args) {
        assert args.length == 3;
        boolean result = isEquals(Integer.valueOf(args[0]), Integer.valueOf(args[1]), Integer.valueOf(args[2]));
        System.out.println(result);
    }
}
