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
        int[] arr = {3,0,1};

        //calling cycleSort function
        System.out.println(cycleSort(arr));
    }

    //cycle sort function to find the missing number
    public static int cycleSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int currElement = arr[i];

            if (currElement < arr.length && arr[i] != arr[currElement]) {
                swap(arr, i, currElement);
            } else {
                i++;
            }
        }

        //now check the missing no
        //cas 1 :- check if there is any missing no from 0 to n-1
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        //case 2 :- check if n is missing
        return arr.length;
    }

    //function to swap the two elements in an array
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}