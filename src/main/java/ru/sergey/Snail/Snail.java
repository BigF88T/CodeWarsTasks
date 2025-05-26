package ru.sergey.Snail;

/**
Учитывая n x n array, возвращает элементы массива, расположенные
 от самых внешних элементов к среднему элементу, перемещаясь по часовой стрелке.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]

Для лучшего понимания, пожалуйста, проследите последовательно
 номера следующего массива:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]

 ПРИМЕЧАНИЕ: Идея заключается не в сортировке элементов
 от наименьшего значения к наибольшему; идея состоит
 в обходе двумерного массива по часовой стрелке в виде улитки.

 ПРИМЕЧАНИЕ 2: 0x0 (пустая матрица) представлена как пустой
 массив внутри массива [[]].

*/

public class Snail {
    public static int[] snail(int[][] array) {
        // enjoy

        int resultLength = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultLength++;
            }
        }

        int[] result = new int[resultLength];
        int index = 0;
        int length = array.length - 1;
        int innerLength = array[0].length - 1;

        for (int i = 0; i <= resultLength - 1; i++){
            for (int j = i; j <= innerLength - i; j++) {
                result[index++] = array[i][j];
                if (index > resultLength - 1) return result;
            }

            for(int j = 1 + i; j <= length - i; j++) {
                result[index++] = array[j][innerLength - i];
                if (index > resultLength - 1) return result;
            }

            for (int j = innerLength - 1 - i; j >= i; j--) {
                result[index++] = array[length - i][j];
                if (index > resultLength - 1) return result;
            }

            for (int j = length - i - 1; j > i; j--) {
                result[index++] = array[j][i];
                if (index > resultLength - 1) return result;
            }
        }

        return result;
    }
}