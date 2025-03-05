package ru.sergey.StopgninnipSMysdroW;
/*
    Напишите функцию, которая принимает строку из одного или нескольких слов и возвращает ту же строку, но со всеми словами,
    в которых пять или более букв перевернуты (как в названии этого Ката). Переданные строки будут состоять только из букв и пробелов.
    Пробелы будут включены только в том случае, если присутствует более одного слова.

    Примеры:

    "Hey fellow warriors"  --> "Hey wollef sroirraw"
    "This is a test        --> "This is a test"
    "This is another test" --> "This is rehtona test"

 */


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinWords {

    public String spinWords(String sentence) {
        //TODO: Code stuff here

        return Stream.of(sentence.split(" "))
                .map(x -> x.length() > 5 ?
                        new StringBuilder(x).reverse().toString() : x)
                .collect(Collectors.joining(" "));
    }
}