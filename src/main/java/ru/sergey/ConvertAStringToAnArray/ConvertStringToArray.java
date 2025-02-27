package ru.sergey.ConvertAStringToAnArray;

/*
    Напишите функцию, чтобы разделить строку и преобразовать ее в массив слов.
    Примеры (input ==> output):

    "Robin Singh" ==> ["Robin", "Singh"]

    "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */
public class ConvertStringToArray {
    public static String[] stringToArray(String s) {
        //your code;
        return s.split(" ");
    }
}
