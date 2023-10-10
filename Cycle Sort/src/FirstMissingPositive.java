////First Missing Positive
//
////https://leetcode.com/problems/first-missing-positive/
//
//
//Given an unsorted integer array nums, return the smallest missing positive integer.
//
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//
//
//
//Example 1:
//
//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.
//Example 2:
//
//Input: nums = [3,4,-1,1]
//Output: 2
//Explanation: 1 is in the array but 2 is missing.
//Example 3:
//
//Input: nums = [7,8,9,11,12]
//Output: 1
//Explanation: The smallest positive integer 1 is missing.











import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};

        //calling firstMissing function
        System.out.println(firstMissing(arr));
    }

    //cycle sort function to find the first missing positive number
    public static int firstMissing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            //check if arr[i] is equal to arr[correctIndex] or not
            //if arr[i] is not equal to arr[correctIndex] then just swap the elements at these two indexes
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap (arr, i, correctIndex);
            }
            //if arr[i] is equal to arr[correctIndex] then just move to the next index
            else {
                i++;
            }
        }


        //now just return the first missing positive number
        //case 1 :
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return j+1;
            }
        }

        //case 2 :
        return arr.length + 1;
    }


    //function to swap the two elements in an array
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}