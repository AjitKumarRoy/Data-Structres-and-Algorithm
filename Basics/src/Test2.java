//order agnostic binary search
//here we don't know whether the array is sorted in ascending or descending order

import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {45, 42, 23, 21, 3, -1, -12};
        int target = -1;

        //calling orderAgnosticBinarySearch function
        int ans = orderAgnosticBinarySearch(arr, target);

        System.out.println(ans);
    }

    //order agnostic binary search function
    public static int orderAgnosticBinarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        //check if the array is ascending or descending
        boolean isAsc = (arr[start] < arr[end]);

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if target is equal to the element at mid
            if (target == arr[mid]) {
                //if target found, then return mid
                return mid;
            }

            //for ascending array
            if (isAsc) {
                //check if target is less than the element at mid index
                if (target < arr[mid]) {
                    //search left
                    end = mid - 1;
                }
                //check if target is greater than the element at mid index
                else {
                    //search right
                    start = mid + 1;
                }
            }

            //for descending array
            else {
                //check if target is greater than the element at mid index
                if (target > arr[mid]) {
                    //search left
                    end = mid - 1;
                } else {
                    //search right
                    start = mid + 1;
                }
            }
        }
        //if we are out of this while loop, that means the target is not found
        //in that case we will return -1, because -ve index doesn't exist in an array
        return -1;
    }
}