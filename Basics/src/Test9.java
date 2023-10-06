////Find in mountain array;
//
//// https://leetcode.com/problems/find-in-mountain-array/
//
//
//(This problem is an interactive problem.)
//You may recall that an array arr is a mountain array if and only if:
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target.
//If such an index does not exist, return -1.
//
//You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
//
//MountainArray.get(k) returns the element of the array at index k (0-indexed).
//MountainArray.length() returns the length of the array.
//Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions
//that attempt to circumvent the judge will result in disqualification.
//
//
//
//Example 1:
//
//Input: array = [1,2,3,4,5,3,1], target = 3
//Output: 2
//Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
//Example 2:
//
//Input: array = [0,1,2,4,2,1], target = 3
//Output: -1
//Explanation: 3 does not exist in the array, so we return -1.


import java.util.*;
public class Test9 {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5,6,3,1,0};
        int target = 3;

        //calling the findTarget function
        System.out.println(findTarget(arr,target));
    }

    //function to find in mountain array
    public static int findTarget(int[] arr, int target) {
        //find the peak element
        int peak = peak(arr);

        //now search the target
        //first search in left part i.e. from index 0 to peak
        int ans = binarySearch(arr, target, 0, peak);

        //if target not found in left part, then search it in the right part
        if (ans == -1) {
            ans = binarySearch(arr, target, peak+1, arr.length-1);
        }
        return ans;
    }

    //function to find the peak in an mountain array
    public static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        //iterate till start is less than  end
        while (start < end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if mid+1 element is greater than the mid element
            if (arr[mid+1] > arr[mid]) {
                //search right
                start = mid + 1;
            }
            //check if mid+1 element is less than mid
            else {
                //search left
                end = mid;
            }
        }
        return start; //or return end;
        //here both start and end contains the same value
    }

    //order agnodtic binary search function
    public static int binarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = (arr[start] < arr[end]);

        //iterate till start is less than or equal to end
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if target element is equal to the element at mid
            if (target == arr[mid]) {
                return mid;
            }

            //for ascending order
            if (isAsc) {
                //check if target element is less than the mid element
                if (target < arr[mid]) {
                    //search left
                    end = mid - 1;
                }
                //check if target element is greater than the mid element
                else {
                    start = mid + 1;
                }
            }
            //for descending order
            else {
                //check if target element is greater than the mid element
                if (target > arr[mid]) {
                    //search left
                    end = mid - 1;
                }
                //check if target element is less than the mid element
                else {
                    //serch right
                    start = mid + 1;
                }
            }
        }
        //if target not found, then return -1
        return -1;
    }
}