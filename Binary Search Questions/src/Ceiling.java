//ceiling :- ceiling means the smallest element in the array that is greater than or equal to
// the target element

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //binary search function
    public static int binarySearch(int[] arr, int target) {
        //but what if target is greater than the greatest number in the array
        if (target > arr[arr.length-1]) {
            //here we are returning -1, because -ve index doesn't exist in an array
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        //iterate while the value of start is less than or equal to end
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if the element at the middle index is equal to the target
            if (arr[mid] == target) {
                //return mid if the target found
                return mid;
            }
            //if target is less than the middle element
            //then search in the left
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            //if target is greater than the middle element
            //then search in the right
            else {
                start = mid + 1;
            }
        }
        //here we are going to return the start
        //because start is the smallest element in the array that is greater than the target element
        return start; //this is the ceiling i.e. the answer
    }
}
