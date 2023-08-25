//Binary Search

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 89;

        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    //binary search function
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        //iterate while start variable is less than the end variable
        while (start <= end) {
            //find mid index
            int mid = start + (end - start) / 2;

            //check if element at the mid is equal to the target
            if(arr[mid] == target) {
                //if target found, then return mid
                return mid;
            }

            //if target not found, then check if target is less than or greater than the mid

            //checking if target is less than the mid
            if (target < arr[mid]) {
                //if this condition is true
                //then we can ignore the right half
                //and search in the left half
                end = mid - 1;
            } else {
                //else if the target is greater than mid, then
                //we can ignore the left half
                //and search in the right half
                start = mid + 1;
            }
        }
        //if target not found, then return -1
        return -1;
    }
}


