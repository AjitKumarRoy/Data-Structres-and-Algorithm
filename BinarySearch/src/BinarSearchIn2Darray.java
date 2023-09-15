//Matrix is sorted in a row-wise and col-wise manner

import java.util.*;
public class BinarSearchIn2Darray {
    public static void main(String[] args){
        //2D-array declared and initialised
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        //target to be searched in the matrix
        int target = 10;

        //finding the index of target by calling the  binary search function mentioned below
        System.out.println(Arrays.toString(binarySearch(arr,target)));
    }


    //binarySearch function to find the index of target in a matrix
    public static int[] binarySearch(int[][] arr, int target){
        int row = 0;
        int col = arr.length-1;

        //loop for iteration
        while (row < arr.length && col >= 0){

            //if the element at current index is equal to target, then return the index
            if(arr[row][col] == target){
                return new int[] {row,col};
            }

            //if the element at current index is less than the target element, then row++
            if(arr[row][col] < target){
                row++;
            }
            // if the element at current index is greater than the target element, then col--
            //
            else {
                col--;
            }
        }
        return new int[] {-1,-1};
    }

}
