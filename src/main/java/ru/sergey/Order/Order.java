package ru.sergey.Order;

import java.util.*;
import java.util.stream.*;

/**
 * Ваша задача — отсортировать заданную строку.
 * Каждое слово в строке будет содержать одно число.
 * Это число — позиция, которую слово должно занимать в результате.
 * <p>
 * Примечание: числа могут быть от 1 до 9. Таким образом, первым словом будет 1 (а не 0).
 * <p>
 * Если входная строка пуста, вернуть пустую строку.
 * Слова во входной строке будут содержать только допустимые последовательные числа.
 * Примеры
 * <p>
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 */
public class Order {
    public static String order(String words) {
        // ...
        if (words.isEmpty())
            return "";

        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparingInt(Order::getNum))
                .collect(Collectors.joining(" "));
    }

    private static int getNum(String word) {
        return word.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .findFirst()
                .orElse(0);
    }
}