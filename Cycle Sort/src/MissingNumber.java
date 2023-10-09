//Missing Number

//https://leetcode.com/problems/missing-number/



//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//
//
//Example 1:
//
//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//Example 2:
//
//Input: nums = [0,1]
//Output: 2
//Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//Example 3:
//
//Input: nums = [9,6,4,2,3,5,7,0,1]
//Output: 8
//Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.


import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};

        //calling cycleSort function to print the missing element in an array
        //containing elements from 0 to N, where also N is the length of array
        System.out.println(cycleSort(arr));

    }

    //cycle sort function to find the missing number from an array containing elements from [0 to n]
    //where n is also the length of array

    public static int cycleSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex =  arr[i]; //because the element is array start from 0 to n

            //check if arr[i] is at correctIndex i.e arr[i]
            //if arr[i] is not at correctIndex then just swap it
            if (correctIndex < arr.length && arr[i] != arr[correctIndex]) {
                //swapping
                swap(arr, i, correctIndex);
            }
            //if arr[i] is at correct index, then just move forward to the next index
            else {
                i++;
            }
        }


        //now the array is sorted and every element is at its own index, except the missing one
        //search the missing element
        //case 1 :- if the elements from 0 to n-1 is missing
        for(int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j; //just return the index
            }
        }
        //case 2 :- if the n'th element is missing
        return arr.length;
    }

    //function to swap the two elements in an array
    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}