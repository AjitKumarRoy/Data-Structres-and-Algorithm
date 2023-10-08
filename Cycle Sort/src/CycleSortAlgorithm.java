//Cycle Sort Algorithm


import java.util.*;
public class CycleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        //calling cycleSort function
        cycleSort(arr);

        //printing array
        System.out.println(Arrays.toString(arr));
    }

    //cycle sort function to sort the array
    public static void cycleSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    //function to swap two elements in an array
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}