package com.linq.exercises.ch01;

/**
 * 1.1.11
 *
 * @author LinQ
 * @version 2013-11-23
 */
public class PrintArray {

    public static void print(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            boolean[] row = array[i];
            for (int j = 0; j < row.length; j++) {
                boolean col = row[j];
                if (col) {
                    System.out.printf("row:%s, col:%s, value:%s\n", i, j, "*");
                } else {
                    System.out.printf("row:%s, col:%s, value:%s\n", i, j, "#");
                }
            }
        }
    }

    public static void main(String[] args) {
        print(new boolean[3][7]);
    }
}
