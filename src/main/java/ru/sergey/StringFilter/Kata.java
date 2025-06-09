package ru.sergey.StringFilter;

import java.util.*;
import java.util.stream.*;

/**
 * В этом ката вы создадите функцию,
 * которая принимает список неотрицательных целых чисел
 * и строк и возвращает новый список с отфильтрованными строками.
 * Пример
 *
 * Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
 * Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
 * Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
 */

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream().filter(o -> o instanceof Integer).collect(Collectors.toList());
    }
}
