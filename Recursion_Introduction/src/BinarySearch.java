//Binary Search with recursion

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 0;

        System.out.println(binarySearch(arr, target, 0, arr.length-1 ));
    }

    //binary search function
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        //find middle element
        int mid = start + (end - start) / 2;

        //check if target element is equal to the element at mid
        if (target == arr[mid]) {
            //if target found, then return mid
            return mid;
        }
        //check if target is less than the middle element
        else if (target < arr[mid]) {
            //search left
            end = mid-1;
            return binarySearch(arr, target, start, end);
        }
        //check if target is greater than middle element
        else {
            //search right
            start = mid + 1;
            return binarySearch(arr, target, start, end);
        }
    }
}