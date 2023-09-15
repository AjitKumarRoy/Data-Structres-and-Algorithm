import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//
//
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
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;

        int[] ans = firstAndLastPosition(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    //function to find the starting and ending position of a given target value
    public static int[] firstAndLastPosition(int[] arr, int target) {
       int[] ans = {-1, -1};
       ans[0] = binarySearch(arr, target, true);

       if (ans[0] != -1) {
           ans[1] = binarySearch(arr, target, false);
       }
       return ans;
    }

    //binary search function
    public static int binarySearch(int[] arr, int target, boolean left) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if the value at middle element is equal to the target
            if (target == arr[mid]) {
                ans = mid; //index is value is stored here
                if (left) {
                    //search left
                    end = mid - 1;
                } else {
                    //search right
                    start = mid + 1;
                }
            }
            //if target is less than the middle element
            //search left
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            //if target is greater than the middle element
            //search right
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
