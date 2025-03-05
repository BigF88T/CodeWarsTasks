package ru.sergey.ShortestWord;

import java.util.Arrays;
import java.util.Comparator;

public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(String::length)
                .min()
                .orElse(-1);
    }
}