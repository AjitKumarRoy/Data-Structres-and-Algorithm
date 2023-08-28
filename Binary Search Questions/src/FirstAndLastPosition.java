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
        int target = 8;
    }
    public static int[] firstAndLastPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int[] ans = {-1, -1};

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                ans = new int[]{mid, -1};
                //search left
                if (arr[mid-1] == target) {
                    end = mid - 1;
                }
            }
        }
    }
}
