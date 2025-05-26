package ru.sergey.Rot13;

/*

ROT13 - это простой шифр буквы, который заменяет букву буквой 13 букв после него в алфавите.
ROT13 является примером шифра Цезаря.

Создайте функцию, которая принимает строку и возвращает строку, забитую ROT13.
Если в строку включены числа или специальные символы, они должны быть возвращены такими, какие они есть.
Только буквы из латинского/английского алфавита должны быть сдвинуты, как в оригинальной реализации ROT13.

 */

import java.util.List;
import java.util.stream.Stream;

public class Rot {
    public static String rot13(String str) {
        // Your code goes here.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){

                if (Character.isUpperCase(ch)){
                    if(ch > 90 - 13)
                        ch -= 26;
                    ch += 13;

                } else {
                    if(ch > 122 - 13)
                        ch -= 26;
                    ch += 13;
                }

            }

            sb.append(ch);
        }
        return sb.toString();
    }
}