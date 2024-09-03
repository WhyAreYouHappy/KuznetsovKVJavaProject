package ru.mirea.kuznetsov;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int arrayLength;

        System.out.println("Введите длину массива: ");
        Scanner scan = new Scanner(System.in);

        arrayLength = scan.nextInt();
        array1 = new int[arrayLength];
        array2 = new int[arrayLength];
        Random rand = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array1[i] = rand.nextInt(-100, 100);
            array2[i] = rand.nextInt(-100, 100);
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }


    }
}
