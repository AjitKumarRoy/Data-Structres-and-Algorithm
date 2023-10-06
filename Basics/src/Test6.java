//Find first and last position of element in sorted array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]

import java.util.*;
public class Test6 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 1;

        //calling the findRange function
        System.out.println(Arrays.toString(findRange(nums, target)));
    }

    //function to find the range of target element
    public static int[] findRange(int[] arr, int target) {
        int[] ans = {-1, -1};

        //searching left index
        ans[0] = binarySearch(arr, target, true);

        //if left index found, that means the target element exists
        //so now search for the right index
        if (ans[0] != -1) {
            ans[1] = binarySearch(arr, target, false);
        }

        return ans;
    }

    //binary search function
    public static int binarySearch(int[] arr, int target, boolean checkLeft) {
        int start = 0;
        int end = arr.length - 1;

        //position of target element
        int ans = -1;

        //iterate till start is less than or equal to end
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if target element is equal to mid element
            if (target == arr[mid]) {
                ans = mid;

                //searching left
                //search left there may exist more target element
                if (checkLeft) {
                    end = mid - 1;
                }

                //searching right
                //search right there may exist more target element
                else {
                    start = mid + 1;
                }

            }
            //check if target is less than the middle element
            else if (target <= arr[mid]) {
                //search left
                end = mid - 1;
            }
            //check if target is greater than the middle element
            else {
                //search right
                start = mid + 1;
            }
        }
        return ans;
    }
}