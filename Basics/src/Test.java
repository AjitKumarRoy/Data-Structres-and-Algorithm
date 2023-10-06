import java.util.*;
public class Test {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 0;

        //calling binary search function
        int ans = binarySearch(arr, target);

        System.out.println(ans);
    }

    //binary search function
    public static int binarySearch(int[] arr, int target) {
         int start = 0;
         int end = arr.length-1;

         //iterate till start is less than or equal to end
         while (start <= end) {
             //find the middle element
             int mid = start + (end - start) / 2;

             //check if target is equal to the element at mid
             if (target == arr[mid]) {
                 //if target found, then return mid index
                 return mid;
             }
             //check if target element is less than the element at mid
             else if (target < arr[mid]) {
                 //search left
                 end = mid - 1;
             }
             //check if target element is greater than the element at mid
             else {
                 //search right
                 start = mid + 1;
             }
         }
         //if we are out of this while loop, that means target is not found
        //in that case we will return -1, because -ve index doesn't exist in array
        return -1;
    }
}