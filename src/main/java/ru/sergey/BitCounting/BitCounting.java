package ru.sergey.BitCounting;

import java.util.stream.Stream;

/*
Напишите функцию, которая принимает целое число в качестве ввода,
и возвращает количество битов, равных одному в двоичном представлении этого числа.

Вы можете гарантировать, что ввод неотрицательный.

Пример : двоичное представление 1234 является 10011010010, поэтому функция должна вернуться 5 в этом случае

 */
public class BitCounting {
    public static int countBits(int n){
        // Show me the code!

        return Integer.bitCount(n);
//        return (int) Stream.of(Integer.toBinaryString(n).split(""))
//                .filter(x -> x.equals("1"))
//                .count();
    }

}