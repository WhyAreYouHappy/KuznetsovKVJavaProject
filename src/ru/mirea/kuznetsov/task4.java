package ru.mirea.kuznetsov;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task4 {
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

        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < arrayLength; i++) {
            binPoisk(array2, array1[i]);
        }
    }

    public static void binPoisk(int[] array, int numToFind){
        int low = 0;
        int high = array.length - 1;
        int middle;

        while(low <= high) {
            middle = (low + high) / 2;
            int num = array[middle];
            if(num == numToFind){
                System.out.print(array[middle]+" ");
                return;
            } else if(num > numToFind){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
    }
}
