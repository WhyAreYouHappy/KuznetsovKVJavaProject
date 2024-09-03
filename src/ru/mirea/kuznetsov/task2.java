package ru.mirea.kuznetsov;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int[] numberArray;
        int arrayLength;

        System.out.println("Введите длину массива: ");
        Scanner scan = new Scanner(System.in);

        arrayLength = scan.nextInt();
        numberArray = new int[arrayLength];
        Random rand = new Random();

        for (int i = 0; i < arrayLength; i++) {
            numberArray[i] = rand.nextInt(-100, 100);
        }
        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));

        System.out.println("Введите число для поиска:");
        int someNum = scan.nextInt();
        binSort(numberArray, someNum);
    }

    public static void binSort(int[] array, int numToFind) {
        int low = 0;
        int high = array.length - 1;
        int middle;
        int iter = 0;

        while(low <= high) {
            iter++;
            middle = (low + high) / 2;
            int num = array[middle];
            if(num == numToFind){
                System.out.println("Значение найдено под индексом "+middle);
                System.out.println("Число иттераций: "+iter);
                return;
            } else if(num > numToFind){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        System.out.println("Искомого значения в массиве нет. Число иттераций: "+iter);
    }
}
