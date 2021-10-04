package com.sparta.SortManager.View;

import com.sparta.SortManager.Controller.ArrayGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ar1 = ArrayGenerator.arrayGenerator();
        System.out.println(Arrays.toString(ar1));
        Sorter theFactory;
        System.out.println("Would you prefer to sort the array with 1)Bubble Sort or 2)Merge Sort");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        switch(choice){
            case "1": theFactory = new BubbleSort(); break;
            case "2": theFactory = new MergeSort(); break;
            default:  theFactory = null; break;
        }
        assert theFactory != null;
        int[] sortedArray = theFactory.whichSort(ar1);
        System.out.println(Arrays.toString(sortedArray));
    }

}
