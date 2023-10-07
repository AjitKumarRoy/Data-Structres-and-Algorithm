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
        int[] arr = {3,5,1};
        int target = 3;

        //calling searchTarget function
        System.out.println(searchTarget(arr, target));
    }

    //function to search for target in an rotated sorted array
    public static int searchTarget(int[] arr, int target) {
        int pivet = pivot(arr);

        //if pivet == -1, that means the array is not rotated
        //just apply the binary search from start to end
        if (pivet == -1) {
            return binarySearch(arr, target, 0, arr.length-1);
        }

        //if pivot is found, then it means you have two ascending sorted arrays
        //now search the target in both the ascending sorted arrays

        //check if target element is equal to the element at pivot
        if (target == arr[pivet]) {
            //if target found, then return pivet
            return pivet;
        }
        //check if target is grater than the first element
        else if (target >= arr[0]) {
            //search left
            return binarySearch(arr, target, 0, pivet-1);
        }
        //check if target is less than the first element
        else {
            //search right
            return binarySearch(arr, target, pivet+1, arr.length-1);
        }
    }

    //binary search function
    public static int binarySearch(int[] arr, int target, int start, int end) {
        //iterate till start is less than or equal to end
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if target element is equal to mid element
            if (target == arr[mid]) {
                return mid;
            }
            //check if target element is less than the mid element
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            //check if target element is greater than the mid element
            else {
                start = mid + 1;
            }
        }
        //if target not found, then return -1
        return -1;
    }

    //function to find the pivot
    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        //iterate till start is less than or equal to end
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}