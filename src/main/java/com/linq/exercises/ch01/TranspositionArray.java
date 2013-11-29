package com.linq.exercises.ch01;

/**
 * 1.1.12
 *
 * @author LinQ
 * @version 2013-11-23
 */
public class TranspositionArray {

    public static<T> void transposition(T[][] array) {
        int n = array[0].length;
        for (int i = 0; i < n; i++) {
            for (T[] anArray : array) {
                System.out.print(anArray[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        transposition(new String[5][3]);
    }
}
