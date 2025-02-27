package ru.sergey.FindSmallestInt;

/*
    Учитывая массив целых чисел, ваше решение должно найти наименьшее целое число.

    Например:

        Данный [34, 15, 88, 2] Ваше решение вернется 2
        Данный [34, -345, -1, 100] Ваше решение вернется -345

    Вы можете предположить, для целей этого Kata, что предоставленный массив не будет пустым.
 */

import java.util.Arrays;

public class FindSmallestInt {
    public static int findSmallestInt(int[] args) {

        return Arrays.stream(args).min().getAsInt();
    }
}