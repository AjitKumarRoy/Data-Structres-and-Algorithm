////Peak Index in a Mountain array
//
//// https://leetcode.com/problems/peak-index-in-a-mountain-array/
//// https://leetcode.com/problems/find-peak-element/
//
//
//An array arr a mountain if the following properties hold:
//
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//Given a mountain array arr, return the
//index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
//
//You must solve it in O(log(arr.length)) time complexity.
//
//
//
//Example 1:
//
//Input: arr = [0,1,0]
//Output: 1
//Example 2:
//
//Input: arr = [0,2,1,0]
//Output: 1
//Example 3:
//
//Input: arr = [0,10,5,2]
//Output: 1


public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0,2,3,6,1,0};

        int ans = binarySearch(arr);
        System.out.println(ans);
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
