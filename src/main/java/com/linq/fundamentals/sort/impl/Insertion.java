package com.linq.fundamentals.sort.impl;

import com.linq.fundamentals.sort.Sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author LinQ
 * @version 2013-11-28
 */
public class Insertion extends Sort {
    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] data = getData();
        sort(data);
        System.out.println(Arrays.toString(data));
    }
}
