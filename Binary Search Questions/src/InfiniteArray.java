////Find position of an element in a sorted array of infinite numbers
//
//// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
//
//
//Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
//Source: Amazon Interview Experience.
//Since array is sorted, the first thing clicks into mind is binary search, but the problem here is
// that we don’t know size of array.
//If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order
// to find position of key, first we find bounds and then apply binary search algorithm.
//Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
//->if it is greater than high index element then copy high index in low index and double the high index.
//->if it is smaller, then apply binary search on high and low indices found.

import java.util.*;
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 90;

        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    //binary search function for infinite array
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = 1;

        //iterate while target element is greater than the element at high index i.e. end
        while (target > arr[end]) {
            int temp = start;
            start = end + 1;
            end = start + 2*(end - temp) + 1;
        }
        return binarySearch(arr, target, start, end);
    }

    //binary search function
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if the element at middle is equal to the target
            if (target == arr[mid]) {
                //if target found then return mid
                return mid;
            }
            //if target is less than the mid
            //search left
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            //if target is greater than the mid
            //search right
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
