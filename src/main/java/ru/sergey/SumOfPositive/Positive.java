package ru.sergey.SumOfPositive;

import java.util.Arrays;

/*
    You get an array of numbers, return the sum of all of the positives ones.
        Example:

        [1, -4, 7, 12] => 1+7+12=20 1 + 7 + 12 = 20 1+7+12=20

    If there is nothing to sum, the sum is default to 0.
 */
public class Positive{

    public static int sum(int[] arr){
        int sum = 0;

        arr = Arrays.stream(arr).filter(x -> x > -1).toArray();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}