package ru.sergey.FindMaximumAndMinimumValuesOfAList;

/*
    Ваша задача - сделать две функции (max и min, или maximum и minimum т. д., в зависимости от языка),
    которые получают список целых чисел в качестве входных данных, и возвращают наибольшее и самое низкое число в этом списке,
    соответственно. Каждая функция возвращает одно число.

    Примеры (вход -> Выход)

    * [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
    * [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
    * [42, 54, 65, 87, 0]             -> min = 0, max = 87
    * [5]                             -> min = 5, max = 5

    Примечания

    Вы можете считать, что не будет никаких пустых массивов/векторов.
 */
public class MaxMinInList {

    public int min(int[] list) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.length; i++)
            if(min > list[i])
                min = list[i];

        return min;
    }

    public int max(int[] list) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.length; i++)
            if(max < list[i])
                max = list[i];

        return max;
    }
}