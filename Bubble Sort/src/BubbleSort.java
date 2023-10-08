//Bubble sort code

import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};

        //calling bubble sort function
        bubbleSort(arr);

        //now printing the original array
        System.out.println(Arrays.toString(arr));
    }

   //bubble sort function to sort the array
    public static void bubbleSort(int[] arr) {
        //first for loop to count the pass
        //pass will start from i = 0 to i < arr.length-1

        for (int i = 0; i < arr.length-1; i++) {
            //second for loop is for swapping the adjacent elements
            //this loop will run only for single pass

            //also check if the array is already sorted
            //in that just come out of the loop
            boolean swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                //swapping
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }
}