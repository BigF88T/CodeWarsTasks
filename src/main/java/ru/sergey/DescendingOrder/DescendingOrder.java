package ru.sergey.DescendingOrder;

import java.util.*;

/**
 * Ваша задача — создать функцию,
 * которая может принимать любое неотрицательное целое число
 * в качестве аргумента и возвращать его с его цифрами в порядке убывания.
 * <p>
 * По сути, переставьте цифры так, чтобы создать максимально возможное число.
 * Примеры:
 * <p>
 * Вход: 42145 Выход: 54421
 * <p>
 * Вход: 145263 Выход: 654321
 * <p>
 * Вход: 123456789 Выход: 987654321
 */

public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
        Queue<Integer> integerQueue = new PriorityQueue<>();
        int delNum = num;
        int result = 0;

        while (delNum > 0) {
            integerQueue.offer(delNum % 10);
            delNum = delNum / 10;
        }

        int index = 1;

        while (!integerQueue.isEmpty()) {
            result += integerQueue.remove() * index;
            index *= 10;
        }

        return result;
    }
}