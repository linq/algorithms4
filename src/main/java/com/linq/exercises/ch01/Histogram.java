package com.linq.exercises.ch01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.1.15
 *
 * @author LinQ
 * @version 2013-11-24
 */
public class Histogram {
    public static int[] histogram(int ar[], int m) {
        Map<Integer, Integer> map = getValueMap(ar);
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            if (map.containsKey(i)) {
                result[i] = map.get(i);
            } else {
                result[i] = 0;
            }
        }

        return result;
    }

    private static Map<Integer, Integer> getValueMap(int[] ar) {
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        for (int value : ar) {
            if (!result.containsKey(value)) {
                result.put(value, 1);
            } else {
                Integer count = result.get(value);
                result.put(value, count + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = histogram(new int[]{1, 2, 65}, 5);
        System.out.println(Arrays.toString(result));
    }
}
