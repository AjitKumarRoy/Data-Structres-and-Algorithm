//Find the rotation count in rotated Sorted array

import java.util.*;
public class Test12 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        //calling rotationCount function

        System.out.println(rotationCount(arr));
    }

    //function to count the rotation
    public static int rotationCount(int[] arr) {
        //first check if the array is rotated or not
        if (findPivot(arr) == -1) {
            //if array is not rotated, then return 0
            return 0;
        }

        return findPivot(arr) + 1;
    }

    //function to find the pivot
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        //iterate till start is less than or equal to end
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //four cases
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

