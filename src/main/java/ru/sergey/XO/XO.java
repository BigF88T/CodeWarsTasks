package ru.sergey.XO;

/**
 * Проверьте, содержит ли строка одинаковое количество
 * символов 'x' и 'o'. Метод должен возвращать логическое
 * значение и быть нечувствительным к регистру.
 * Строка может содержать любой символ.
 * <p>
 * Примеры ввода/вывода:
 * <p>
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 */

public class XO {

    public static boolean getXO(String str) {

        // Good Luck!!

        int x = 0, o = 0;

        for (int i = 0; i < str.length(); i++) {
            char character = str.toLowerCase().charAt(i);
            if (character == 'x') x++;
            if (character == 'o') o++;
        }

        return x == o;
    }
}