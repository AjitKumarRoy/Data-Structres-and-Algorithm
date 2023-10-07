//find the pivot in rotated sorted array with duplicate elements

import java.util.*;
public class PivotWithDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {0,1,1,2,0,0};
//{2,5,6,0,0,1,2}; //{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        // {1,0,1,1,1} // 2,9,2,2,2,2 // [0,1,1,2,0,0]

        //pivot function calling
        System.out.println(pivot(arr));
    }

    //function to find the pivot
    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check these two cases first
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            //if elements at middle, start and end are equal then just skip the duplicate
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the elements
                //but first check if the element at start is the pivot
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;

                //now check if the element at end is the pivot
                if (arr[end] < arr[end-1]) {
                    return end-1;
                }
                end--;
            }

            //left side is sorted,so pivot should be in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end] ) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}