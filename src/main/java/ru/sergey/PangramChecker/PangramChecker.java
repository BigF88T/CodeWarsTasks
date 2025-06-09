package ru.sergey.PangramChecker;

/**
 * Панграмма — это предложение, которое содержит каждую букву алфавита
 * хотя бы один раз.
 * Например, предложение «The quick brown fox jumps over the lazy dog»
 * является панграммой, потому что в нем хотя бы один раз используются
 * буквы AZ (регистр не имеет значения).
 * <p>
 * Дана строка, определить, является ли она панграммой.
 * Верните True, если это так, False, если нет.
 * Игнорируйте цифры и знаки препинания.
 */

public class PangramChecker {
    public boolean check(String sentence) {
        sentence = sentence.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++)
            if (!sentence.contains("" + c))
                return false;
        return true;
    }
}