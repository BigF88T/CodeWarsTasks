package ru.sergey.NarcissisticNumbers;

/*
Нарциссическое число (или число Армстронга) - это положительное число,
которое представляет собой сумму своих собственных цифр,
каждый из которых поднимается к мощности количества цифр в данной базе.

В этом ката, мы будем ограничиваться десятичным (базой 10).

Например, возьмите 153 (3 цифры), что является нарциссическим:

1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

и 1652 (4 цифры), что не:

1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938

Задача:

Ваш код должен вернуть true или false (не «true» и «false») в зависимости от того, является ли данное число нарциссическим числом в базе 10.

Это может быть правдой и ложным на вашем языке, например, PHP.

Проверка ошибок для текстовых строк или других недопустимых входов не требуется, в функцию будут переданы только допустимые положительные ненулевые целые числа.
 */
public class NarcissisticNum {

    public static boolean isNarcissistic(int number) {
        // TODO replace with your code

        String strNum = String.valueOf(number);
        int counter = 0;

        for(int i = 0; i < strNum.length(); i++) {
            counter += (int) Math.pow(Integer.parseInt(String.valueOf(strNum.charAt(i))), strNum.length());
        }

        return number == counter;
    }
}