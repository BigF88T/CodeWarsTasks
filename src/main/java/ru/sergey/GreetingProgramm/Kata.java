package ru.sergey.GreetingProgramm;

/**
 * Создайте функцию, которая принимает параметр,
 * представляющий name и возвращает сообщение:
 * "Hello, <name> how are you doing today?".
 *
 * [Убедитесь, что вы вводите именно то, что я написал, иначе программа может работать некорректно]
 */

public class Kata {
    public static String greet(String name) {
        // Your code here
        return String.format("Hello, %s how are you doing today?", name);
    }
}