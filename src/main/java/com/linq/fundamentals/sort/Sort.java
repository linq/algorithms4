package com.linq.fundamentals.sort;

/**
 * 排序算法
 *
 * @author LinQ
 * @version 2013-11-28
 */
public class Sort {

    protected static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo; i < hi + 1; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    protected static void exch(Object[] a, int i, int min) {
        Object obj = a[i];
        a[i] = a[min];
        a[min] = obj;
    }

    @SuppressWarnings("unchecked")
    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected static Integer[] getData() {
        return new Integer[]{9, 2, 0, 11, 5};
    }
}
