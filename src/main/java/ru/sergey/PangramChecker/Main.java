package ru.sergey.PangramChecker;

public class Main {
    public static void main(String[] args) {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";

        PangramChecker checker = new PangramChecker();
        System.out.println(checker.check(pangram1));
    }
}
