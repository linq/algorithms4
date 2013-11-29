package com.linq.fundamentals.sort.impl;

import com.linq.fundamentals.sort.Sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author LinQ
 * @version 2013-11-28
 */
public class Selection extends Sort {
    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
            assert isSorted(a, 0, i);
        }
    }

    public static void main(String[] args) {
        Integer[] data = getData();
        sort(data);
        System.out.println(Arrays.toString(data));
    }
}
