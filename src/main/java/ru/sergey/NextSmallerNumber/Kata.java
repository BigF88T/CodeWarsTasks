package ru.sergey.NextSmallerNumber;

import java.util.Arrays;

/**
 * Напишите функцию, которая принимает положительное целое число и возвращает следующее меньшее положительное целое число, содержащее те же цифры.
 *
 * Например:
 *
 * nextSmaller(21) == 12
 * nextSmaller(531) == 513
 * nextSmaller(2071) == 2017
 *
 * Возврат -1 (для Haskell: возвращаться Nothing, для Rust: возвращаться None), когда нет меньшего числа, содержащего те же цифры. Также возвращает -1, когда следующее меньшее число с теми же цифрами потребует, чтобы первая цифра была равна нулю.
 *
 * nextSmaller(9) == -1
 * nextSmaller(111) == -1
 * nextSmaller(135) == -1
 * nextSmaller(1027) == -1 // 0721 is out since we don't write numbers with leading zeros
 *
 *     некоторые тесты будут включать очень большие числа.
 *     В тестовых данных используются только положительные целые числа.
 *
 * Функция, которую вы напишете для этого задания, является обратной функцией этого ката: « Следующее большее число с теми же цифрами ».
 */


public class Kata {
    public static long nextSmaller(long n) {
        //Put your lovely code here ^_^

        char[] nums = Long.toString(n).toCharArray();
        int pivot = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) return -1;

        int swapIndex = -1;
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] < nums[pivot]) {
                swapIndex = i;
                break;
            }
        }

        swap(nums, pivot, swapIndex);

        Arrays.sort(nums, pivot + 1, nums.length);
        reverse(nums, pivot + 1, nums.length - 1);

        if (nums[0] == '0') {
            return -1;
        }

        long result = Long.parseLong(new String(nums));
        return result < n ? result : -1;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}