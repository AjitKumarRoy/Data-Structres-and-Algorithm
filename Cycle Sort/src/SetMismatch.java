////Set Mismatch
//
////https://leetcode.com/problems/set-mismatch/
//
//
//
//
//
//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
//
//You are given an integer array nums representing the data status of this set after the error.
//
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
//
//
//
//Example 1:
//
//Input: nums = [1,2,2,4]
//Output: [2,3]
//Example 2:
//
//Input: nums = [1,1]
//Output: [1,2]










import java.util.*;
public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};

        //calling cycleSort function to print the duplicate and missing number
        System.out.println(Arrays.toString(cylceSort(arr)));
    }

    //cycle sort function to find the duplicate number and also the missing number
    public static int[] cylceSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            //check if arr[i] is equal to the correctIndex or not
            //if arr[i] is not equal to the arr[correctIndex] then swap the elements at these two indexes
            if (arr[i] != arr[correctIndex]) {
                swap (arr, i, correctIndex);
            }
            //if arr[i] is equal to the arr[correctIndex] then just move to the next index
            else {
                i++;
            }
        }

        //now the array is sorted
        //just iterate over it and find the duplicate element and also the missing element
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return new int[] {arr[j], j+1};
                //arr[j] is the duplicate element and j+1 is the missing element
            }
        }
        //if everything is okay and there is no duplicate element and no missing number
        //then just return {-1,-1}
        return new int[] {-1, -1};
    }


    //function to swap the two elements in an array
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
