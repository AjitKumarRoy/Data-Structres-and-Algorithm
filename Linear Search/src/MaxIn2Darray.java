//find the maximum item in 2-D array

import java.util.*;
public class MaxIn2Darray {
    public static void main (String[] args) {
        int[][] arr = {
                {230, 23, 2, 53},
                {-1, 300},
                {34, -3, 0},
                {3, 10, 1, 101}
        };
        System.out.println(linearSearch(arr));
    }
    //function to maximum item in 2-D array
    public static int linearSearch (int[][] arr) {
        int max = Integer.MIN_VALUE; //max variable is initialised with the  possible minimum value of integer

        //traverse the array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                //check if current element is greater than the max variable
                if (arr[row][col] > max) {

                    //update the value of max
                    max = arr[row][col];
                }
            }
        }
        //return the maximum item i.e updated value of max variable
        return max;
    }
}
