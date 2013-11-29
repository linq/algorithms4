package com.linq.exercises.ch01;

import com.linq.fundamentals.BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1.1.24
 *
 * @author LinQ
 * @version 2013-11-26
 */
public class ParameterBinarySearch {
    public static int[] WHITE_LIST = {2, 6, 1, 9, 23, 99, 81, 7, 44};

    public static void main(String[] args) {
        assert args.length == 1;
        String option = args[0];
        List<Integer> values = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int value;
        while ((value = scanner.nextInt()) != 0) {
            values.add(value);
        }

        if ("+".equals(option)) {
            for (Integer vl : values) {
                if (BinarySearch.rank(vl, WHITE_LIST) == -1) {
                    System.out.println(vl);
                }
            }
        } else {
            for (Integer vl : values) {
                if (BinarySearch.rank(vl, WHITE_LIST) != -1) {
                    System.out.println(vl);
                }
            }
        }
    }
}
