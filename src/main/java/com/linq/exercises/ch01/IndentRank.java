package com.linq.exercises.ch01;

/**
 * 1.1.22
 *
 * @author LinQ
 * @version 2013-11-26
 */
public class IndentRank {
    public static int rank(int key, int[] a, int lo, int hi, String indent) {
        System.out.printf("%slo:%d, hi:%d\n", indent, lo, hi);
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, " " + indent);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, " " + indent);
        } else {
            return mid;
        }
    }

    public static int indentRank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, "");
    }

    public static void main(String[] args) {
        indentRank(9, new int[]{2, 6, 1, 9, 23, 99, 81, 7, 44});
    }
}
