//floor :- floor means the biggest number that is smaller than or equal to the target number

import java.util.*;
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;


        //function to find the floor called
        int ans = floor(arr, target);

        System.out.println(ans);
    }

    //binary search function to find the floor
    public static int floor (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //iterate till start is less than or equal to end
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if target element is equal to the mid element
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
        //here, we are going to return end
        return end; //this is the floor i.e. the answer
    }
}