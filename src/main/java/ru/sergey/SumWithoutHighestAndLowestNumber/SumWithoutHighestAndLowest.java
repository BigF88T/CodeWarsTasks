package ru.sergey.SumWithoutHighestAndLowestNumber;

import java.util.Arrays;
import java.util.Objects;

/*
Сумма всех чисел данного массива (список CQ.), За исключением самых высоких и самых низких элементов (по значению, а не по индексу!).
Самый высокий или самый низкий элемент, соответственно - это единственный элемент на каждом краю, даже если есть более одного с одинаковым значением.
Имейте в виду проверку ввода.
 */

public class SumWithoutHighestAndLowest {
    public static int sum(int[] numbers)
    {
        if (
                Objects.isNull(numbers) ||
                numbers.length == 0 ||
                numbers.length == 1 )

            return 0;

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();

        return Arrays.stream(numbers).sorted().dropWhile(x -> x == min).limit(numbers.length-2).sum();

        //return Arrays.stream(numbers).filter(x -> x != max && x != min && Objects.nonNull(x)).sum();
    }
}