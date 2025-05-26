package ru.sergey.AddingBigNumbers;

public class Kata {
    public static String add(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;
            int sum = digitA + digitB + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);
        }

        if (result.charAt(0) == '0') {
            while (result.charAt(0) == '0'){
                result.deleteCharAt(0);
            }
        }

        return result.toString();
    }
}