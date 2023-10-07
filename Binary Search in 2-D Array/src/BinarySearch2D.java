//Matrix is sorted in row-wise and col-wise manner
//it doesn't have to be nxn, it can be nxm

import java.util.*;
public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        int target = 34;

        //calling binarySearch function
        System.out.println(Arrays.toString(binarySearch(arr, target)));
    }

    //binary search function for 2-D array
    public static int[] binarySearch(int[][] arr, int target) {
        int row = 0;
        int col = arr.length-1;

        while (row < arr.length && col >= 0) {

            //current element
            int currElement = arr[row][col];

            //check if target element is equal to the current element
            if (target == currElement) {
                //if target found, then return the indexes
                return new int[] {row, col};
            }
            //check if target element is less than the current element
            else if (target < currElement) {
                //search left
                col--;
            }
            //check if target element is greater than the current element
            else {
                row++;
            }
        }
        //if target not found then return {-1, -1}
        //because -ve indexes doesn't exist in an array
        return new int[] {-1, -1};
    }
}