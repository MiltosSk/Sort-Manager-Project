package com.sparta.SortManager;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static int[] arrayGenerator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in the array: ");
        int numberOfElements = scan.nextInt();

        Random rand = new Random();
        int[] array = new int[numberOfElements];
        for(int i=0; i< array.length; i++)
        {
            array[i]=rand.nextInt(100);
        }
        return array;
    }


}