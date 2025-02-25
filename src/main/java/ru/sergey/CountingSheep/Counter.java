package ru.sergey.CountingSheep;

/*

Рассмотрим массив/список овец, где у некоторых овец может отсутствовать на их месте.
Нам нужна функция, которая подсчитывает количество овец, присутствующих в массиве (значения true присутствуют).

Например,

[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]

Правильный ответ был бы 17.

Подсказка: не забудьте проверить плохие значения, такие как null/ undefined


 */

//TODO:Для класса написан тест CounterTest - запустите его, если хотите удостовериться в правильности решения

public class Counter {
    public static int  countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean isTrue : arrayOfSheeps) {
            if (isTrue != null && isTrue) {
                counter++;
            }
        }
        return counter;
    }
}
