////Find in mountain array;
//
//// https://leetcode.com/problems/find-in-mountain-ar

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5,6,3,1,0};
        int target = 3;

        int ans = mountainArray(arr, target);
        System.out.println(ans);
    }

    //function to search in the mountain array
    public static int mountainArray(int[] arr, int target) {
        int start = 0;
        //binary search function to find the peak index is called
        int peak = binarySearch(arr);

        //searching left
        //order agnostic binary search function called
        int ans = orderAgnosticBinarySearch(arr,target,start,peak);

        //if ans not found i.e. ans = -1 then,
        //searching right
        if (ans == -1) {
            ans = orderAgnosticBinarySearch(arr,target,peak,arr.length-1);
        }
        return ans;
    }

    //order agnostic binary search function
    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //if the element at middle index is equal to the target value
            //then return mid
            if (target == arr[mid]) {
                return mid;
            }

            //check if the array is ascending or descending
            if (arr[start] < arr[end]) { //for ascending array
                //if target is less than the element at middle index
                //search left
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                //if target is greater than the element at middle index
                //search right
                else {
                    start = mid + 1;
                }
            } else { //for descending array
                //if target is greater than the element at middle index
                //search left
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                //if target is less than the element at middle index
                //search right
                else {
                    start = mid + 1;
                }
            }
        }
        //if target not found, then return -1
        //because -ve index doesn't exist in an array
        return -1;
    }

    //binary search function to find the peak index
    public static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        //iterate while start is less than end
        while (start < end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if mid+1 element is greater than the element at mid
            if (arr[mid+1] > arr[mid]) {
                start = mid + 1;
            }
            //if element at mid+1 is less than or equal to the element at mid then
            else {
                end = mid;
            }
        }
        return start; // or return end, because both have the same value;
    }
}
