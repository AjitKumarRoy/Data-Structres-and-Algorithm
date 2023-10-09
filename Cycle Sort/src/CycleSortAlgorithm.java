//Cycle Sort Algorithm

import java.util.*;
public class CycleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        //calling cycleSort function
        cycleSort(arr); //now the array is sorted

        //printing the array
        System.out.println(Arrays.toString(arr));
    }

    //cycle sort algorithm
    public static void cycleSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            //check if arr[i] is at correctIndex or not
            //if not them swap arr[i] to the correctIndex
            if (arr[i] != arr[correctIndex]) {
                swap (arr, i, correctIndex);
            }
            //if arr[i] is already at correct index, then just move to next index i.e. i++
            else {
                i++;
            }
        }
    }

    //function to swap the two elements in an array
    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}