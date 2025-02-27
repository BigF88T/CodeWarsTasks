package ru.sergey.Grasshopper;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    Книга класса

    Заполните функцию так, чтобы она обнаружила, что среднее из трех баллов прошло к ней, и возвращает значение буквы, связанное с этим классом.
        Числовой счет 	       Буква
    90 <= оценка <= 100 	    'A'
    80 <= оценка  <  90 	    'B'
    70 <= оценка  <  80 	    'C'
    60 <= оценка  <  70 	    'D'
     0 <= оценка  <  60 	    'F'

    Протестированные значения составляют от 0 до 100. Нет необходимости проверять отрицательные значения или значения, превышающие 100.
 */
public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        double avg = IntStream.of(s1,s2,s3).average().getAsDouble();
//
//        if (avg >= 90)
//            return 'A';
//        else if (avg >= 80)
//            return 'B';
//        else if (avg >= 70)
//            return 'C';
//        else if (avg >= 60)
//            return 'D';
//
//        return 'F';

        return avg > 89 ? 'A' : avg > 79 ? 'B' : avg > 69 ? 'C' : avg > 59 ? 'D' : 'F';
    }
}