//Selection Sort Algorithm

import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        //calling selectionSort function
        selectionSort(arr);

        //printing the array
        System.out.println(Arrays.toString(arr));
    }

    //selection sort function
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {

            int start  = 0;
            int end = arr.length-i-1;
            int maxIndex = maxIndex(arr, start, end);

//            //if the array is already sorted, then just skip the sorted part
//            //if end == maxIndex,it means that part of the array is already sorted
//            if (maxIndex < end) {
//                swap(arr,maxIndex,end);
//            }

            //find the max item in the remaining array from start to end and then swap it with the rightmost index i.e last index

            swap(arr,maxIndex,end);
        }
    }

    //swapping function
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //function to find the index of maximum element in the array
    public static int maxIndex(int[] arr, int start, int end) {
        int max = 0; // we are considering the element at 0'th index as max element

        //find the index of maximum element between starting index to ending index
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i; //it will contain the index having the maximum element value
            }
        }
        return max;
    }
}