package ru.sergey.SortTheOdd;

import java.util.*;

/**
 * Вам будет дан массив чисел.
 * Вам нужно отсортировать нечетные числа в порядке возрастания,
 * оставив четные числа на своих исходных позициях.
 * <p>
 * Примеры:
 * <p>
 * [7, 1]  =>  [1, 7]
 * [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
 * [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 */


public class Kata {
    public static int[] sortArray(int[] array) {

        int[] oddNumbers = Arrays.stream(array).filter(i -> i % 2 != 0).sorted().toArray();

        for (int i = 0, oddIndex = 0; i < array.length; i++) {
            if (array[i] % 2 !=0)
                array[i] = oddNumbers[oddIndex++];
        }

        return array;
    }
}