package com.linq.exercises.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1.1.21
 *
 * @author LinQ
 * @version 2013-11-25
 */
public class PrintTable {

    public static void main(String[] args) throws IOException {
        System.out.println(print(System.in));
    }

    public static String print(InputStream stream) throws IOException {
        List<String> lines = readLines(stream);
        List<Meta> metas = lines2Metas(lines);
        StringBuilder builder = new StringBuilder(300);
        builder.append("<table>");
        for (Meta meta : metas) {
            builder.append("<tr>");
            builder.append("<td>").append(meta.name).append("</td>");
            builder.append("<td>").append(meta.x).append("</td>");
            builder.append("<td>").append(meta.y).append("</td>");
            builder.append("<td>").append(meta.x / meta.y).append("</td>");
            builder.append("</tr>");
            builder.append("\n");
        }
        builder.append("</table>");
        return builder.toString();
    }

    public static List<String> readLines(InputStream stream) throws IOException {
        List<String> result = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line;
        while ((line = reader.readLine()) != null && !"".equals(line)) {
            result.add(line);
        }

        reader.close();
        stream.close();

        return result;
    }

    public static List<Meta> lines2Metas(List<String> lines) {
        List<Meta> result = new ArrayList<Meta>();
        for (String line : lines) {
            String[] strs = line.split(" ");
            if (strs.length == 3) {
                Meta meta = new Meta();
                meta.name = strs[0];
                meta.x = Integer.valueOf(strs[1]);
                meta.y = Integer.valueOf(strs[2]);
                result.add(meta);
            }
        }

        return result;
    }

    static class Meta {
        String name;
        int x;
        int y;
    }
}
