////Find all duplicates in an array
//
//// https://leetcode.com/problems/find-all-duplicates-in-an-array/
//
//
//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
//
//You must write an algorithm that runs in O(n) time and uses only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]
//Example 2:
//
//Input: nums = [1,1,2]
//Output: [1]
//Example 3:
//
//Input: nums = [1]
//Output: []




import java.util.*;
public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 3, 2, 1};

        //calling cyclicSort function
        System.out.println(cyclicSort(arr));
    }

    //cyclic sort function to find all the duplicates in an array

    public static List<Integer> cyclicSort(int[] arr){
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            //check if arr[i] is equal to the correctIndex or not
            //if not, then swap it with the correctIndex
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            //if yes, then just move to the next index
            else {
                i++;
            }
        }


        //now just find the missing numbers or duplicate numbers
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                ans.add(arr[j]);
            }
        }
        return ans;
    }

    //function to swap the two elements in an array
    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}