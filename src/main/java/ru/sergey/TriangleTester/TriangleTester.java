package ru.sergey.TriangleTester;

/**
 * Реализуйте функцию, которая принимает 3 целочисленных значения a, b, c.
 * Функция должна возвращать true, если треугольник может быть построен
 * со сторонами заданной длины, и false в любом другом случае.
 *
 * (В этом случае все треугольники должны иметь поверхность больше 0, чтобы быть принятыми).
 *
 * Примеры:
 *
 * Input -> Output
 * 1,2,2 -> true
 * 4,2,3 -> true
 * 2,2,2 -> true
 * 1,2,3 -> false
 * -5,1,3 -> false
 * 0,2,3 -> false
 * 1,2,9 -> false
 */

public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c){
        if (a <= 0 || b <= 0 || c <= 0)
            return false;

        if (a + b > c && b + c > a && c + a > b)
            return true;
        else
            return false;
    }
}
