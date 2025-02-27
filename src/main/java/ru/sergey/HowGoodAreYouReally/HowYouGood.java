package ru.sergey.HowGoodAreYouReally;

import java.util.Arrays;

/*
    В вашем классе был тест, и вы прошли его. Поздравляю!

    Но ты амбициозный человек. Вы хотите знать, лучше ли вы среднего ученика в вашем классе.

    Вы получаете массив с результатами тестов ваших сверстников. Теперь рассчитайте средний и сравните свой счет!

    Возвращаться true Если тебе лучше, иначе false!
    Примечание:

    Ваши точки не включены в массив точек вашего класса. Не забывайте их при расчете среднего балла!
 */
public class HowYouGood {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        return Arrays.stream(classPoints).average().getAsDouble() < yourPoints;
    }
}
