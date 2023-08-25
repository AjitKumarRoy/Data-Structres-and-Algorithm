//Order Agnostic Binary Search
//Here, we don't know whether the array is sorted in ascending or descending order

import java.util.*;
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        //int[] arr = {45, 42, 23, 21, 3, -1, -12};
        int target = 89;

        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    //order agnostic binary search function
    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if the middle element is equal to target
            if (arr[mid] == target) {
                //if target found, then return mid
                return mid;
            }

            //binary search for ascending order
            if (arr[start] < arr[end]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            //binary search for descending order
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        //if target not found, then return -1
        //we are returning -1, because -ve index doesn't exist in an array
        return -1;
    }
}
