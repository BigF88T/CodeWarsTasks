package ru.sergey.SumArrays;
/*
Напишите функцию, которая принимает массив чисел и возвращает сумму чисел.
Числа могут быть отрицательными или не-integer. Если массив не содержит никаких чисел, то вы должны вернуть 0.

Примеры

Вход: [1, 5.2, 4, 0, -1]
Выход: 9.2

Вход: []
Выход: 0

Вход: [-2.398]
Выход: -2.398
Предположения

Вы можете предположить, что вам дают только числа.
Вы не можете предположить размер массива.
Вы можете предположить, что вы получите массив, и если массив пуст, верните 0.

Тесты ожидают точности 1e-4.
Что мы тестируем

Мы тестируем основные петли и математические операции. Это для начинающих, которые просто изучают петли и математические операции.
Расширенные пользователи могут найти это чрезвычайно простым и могут легко написать это в одной строке.
 */

import java.util.Arrays;

public class SumArray {

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}