//Insertion Sort Algorithm

import java.util.*;
public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        //calling insertionSort function
        insertionSort(arr);

        //printing the array
        System.out.println(Arrays.toString(arr));
    }

    //Insertion Sort Algorithm
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            //consider the element at 0th index as sorted
            for (int j = i+1; j > 0; j--) {

                //check if element from 1st index is smaller than the previous element
                if (arr[j] < arr[j-1]) {
                    //if the current element is smaller than the previous element,
                    //then just swap it;
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }

    //swapping function
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}