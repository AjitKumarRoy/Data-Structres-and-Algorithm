//find position of an element in a sorted array of infinite numbers

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/


//Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
//        Source: Amazon Interview Experience.
//        Since array is sorted, the first thing clicks into mind is binary search, but the problem here is
//        that we don’t know size of array.
//        If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order
//        to find position of key, first we find bounds and then apply binary search algorithm.
//        Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
//        ->if it is greater than high index element then copy high index in low index and double the high index.
//        ->if it is smaller, then apply binary search on high and low indices found.



import java.util.*;
public class Test7 {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 3;

        //calling findTarget function
        int ans = findTarget(arr,target);
        System.out.println(ans);
    }

    //function to find the target element in an infinite array
    public static int findTarget(int[] arr, int target) {
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]) {
            start = end + 1;
            end = 2 * start + 1;
        }
        return binarySearch(arr, target, start, end);
    }

    //binary search function
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if target element is equal to mid element
            if (target == arr[mid]) {
                //if target found, then return mid
                return mid;
            }
            //check if target element is less than the mid element
            else if (target < arr[mid]) {
                //search left
                end = mid - 1;
            }
            //check if target element is greater than the mid element
            else {
                //search right
                start = mid + 1;
            }
        }
        //if target not found, then return -1
        return -1;
    }
}



