//search in sorted matrix
//it doesn't have to nxn, it can also be nxm

import java.util.*;
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 5;

        //calling search function
        System.out.println(Arrays.toString(search(arr,target)));
    }

    //binary search function for 2-D array
    public static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0]. length; //be cautious matrix may be empty

        if (cols == 0) {
            return new int[] {-1, -1};
        }

        //check if it is a linear array
        if (rows == 1) {
            return binarySearch(arr, target , 0, 0, cols - 1);
        }


        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd -1)) { //run the loop till two rows are remaining
            //find the middle row
            int rMid = rStart + (rEnd - rStart) / 2;

            //check if target element is equal to the element at [rMid][cMid]
            if (target == arr[rMid][cMid]) {
                //if target found, then return the index
                return new int[] {rMid,cMid};
            }
            //check if target element is greater than the element at [rMid][cMid]
            else if (target < arr[rMid][cMid]) {
                rEnd = rMid;
            }
            //check if target element is greater than the element at [rMid][cMid]
            else {
                rStart = rMid;
            }
        }

        //now we have two rows
        //our target element lies somewhere in between these two rows only

        //now check whether the target element lies in cMid of these two rows
        //checking cMid of 1st row
        if (target == arr[rStart][cMid]) {
            return new int[] {rStart, cMid};
        }
        //checking cMid of 2nd row
        if (target == arr[rEnd][cMid]) {
            return new int[] {rEnd, cMid};
        }

        //search in 1st half
        if (target <= arr[rStart][cMid-1]) {
            //apply binary search from 0 to cMid-1
            return binarySearch(arr, target, rStart, 0, cMid-1);
        }
        //search in 2nd half
        if (target >= arr[rStart][cMid+1] && target <= arr[rStart][cols-1]) {
            return binarySearch(arr, target, rStart, cMid+1, cols-1);
        }
        //search in 3rd half
        if (target <= arr[rEnd][cMid-1]) {
            return binarySearch(arr, target, rEnd, 0, cMid-1);
        }
        //search in 4th half
        else {
            return binarySearch(arr, target, rEnd, cMid+1, cols-1);
        }
    }

    //normal binary search function
    public static int[] binarySearch(int[][] arr, int target, int row, int cStart, int cEnd) {
        while (cStart <= cEnd) {
            //find the middle element i.e cMid
            int cMid = cStart + (cEnd - cStart) / 2;

            //check if target element is equal to the element at cMid
            if (target == arr[row][cMid]) {
                //if target found then return the index
                return new int[] {row, cMid};
            }
            //check if target element is less than the element at cMid
            else if (target < arr[row][cMid]) {
                //search left
                cEnd = cMid - 1;
            }
            //check if target element is greater than the element at cMid
            else {
                //search right
                cStart = cMid + 1;
            }
        }
        //if target not found, then return {-1, -1}
        //because -ve index doesn't exist in an array
        return new int[] {-1,-1};
    }
}