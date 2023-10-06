//ceiling :- ceiling means the smallest element in the array that is greater than or equal to the target element


import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 180;

        //calling the ceiling function
        int ans = ceiling(arr, target);

        System.out.println(ans);
    }

    //binary search function to find the ceiling
    public static int ceiling (int[] arr, int target) {
        //but what if the target is greater than the greatest element in the array
        if (target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        //iterate till start is less than or equal to end
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if the middle element is equal to the target element
            if (target == arr[mid]) {
                //if target found, then return mid
                return mid;
            }

            //check if target element is less than the element at mid index
            else if (target < arr[mid]) {
                //search left
                end = mid - 1;
            }

            //check if target element is greater than the element at mid index
            else {
                //search right
                start = mid + 1;
            }
        }
        //when the loop will end, the start index will be our required ans
        //so, here we are going to return start
        return start; // this is the ceiling i.e. the answer
    }
}