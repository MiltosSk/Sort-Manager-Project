package com.sparta.SortManager.Model;

public class MergeSort {
    @Override
    public int[] whichSort(int[] array){
        mergeSort(array);
        return array;
    }
    public int[] mergeSort(int[] array){
        int arraySize = array.length;
        if(arraySize < 2){
            return array;
        }
        int middleIndex = arraySize / 2;
        int[] leftHalf = new int[middleIndex];
        int[] rightHalf = new int[arraySize - middleIndex];

        for (int i = 0; i < middleIndex; i++){
            leftHalf[i] = array[i];
        }

        for (int i = middleIndex; i < arraySize; i++){
            rightHalf[i - middleIndex] = array[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array, leftHalf, rightHalf);
        return array;
    }

    public static void merge(int[] array, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;
        while(i < leftSize && j < rightSize){
            if (leftHalf[i] <= rightHalf[j]){
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[i];
                j++;
            }
            k++;
        }
        while(i < leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j < rightSize){
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

}
