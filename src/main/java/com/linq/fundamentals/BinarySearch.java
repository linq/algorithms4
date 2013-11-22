package com.linq.fundamentals;

import java.util.Arrays;
import java.util.Random;

/**
 * p9
 *
 * @author LinQ
 * @version 2013-11-22
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static int rank2(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] whitelist = {2, 6, 1, 9, 23, 99, 81, 7, 44};
        Arrays.sort(whitelist);
        int key = whitelist[new Random().nextInt(whitelist.length - 1)];
        System.out.println(key);
        int rank = rank(key, whitelist);
        int rank2 = rank2(key, whitelist);
        System.out.println(rank);
        System.out.println(rank2);
    }
}
