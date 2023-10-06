//search in rotated sorted array
////Search in Rotated Sorted Array
////Rotated Binary Search
//
//// https://leetcode.com/problems/search-in-rotated-sorted-array/
//
//
//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
//such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
//For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
//or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
//Example 3:
//
//Input: nums = [1], target = 0
//Output: -1



import java.util.*;
public class Test10 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(pivot(arr));
    }

    //function to find the pivot
    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]) {
                return mid;
            }

            if (arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            if (arr[mid + 1] > arr[mid]) {
                start = mid + 1;
            }
            else if (arr[mid+1] <= arr[mid]) {
                end = mid;
            }
            else if (arr[mid+1] > arr[mid] && arr[mid] < arr[start]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}