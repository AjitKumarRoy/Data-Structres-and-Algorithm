//linear search in 2-D array

import java.util.*;
public class SearchIn2Darray {
    public static void main (String[] args) {
        int[][] arr = {
                {23, 23, 2, 53},
                {-1, 3},
                {34, -3, 0},
                {3, 10, 1, 1}
        };
        int target = 2;

        System.out.println(Arrays.toString(linearSearch(arr,target)));
    }
    // function to search an item in the 2-D array
    public static int[] linearSearch (int[][] arr, int target) {
        //traverse the array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                //check if current element is equal to target
                if (target == arr[row][col]) {
                    //if target found then return the index
                    return new int[] {row, col};
                }
            }
        }
        //if target not found then return [-1,-1]
        return new int[] {-1,-1};
    }
}
