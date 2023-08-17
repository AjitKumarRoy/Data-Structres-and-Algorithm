// searching : return the index if item found otherwise if item not found return -1;


import java.util.*;
public class Basic {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        // array declared and initialized

        int target = 1;
        //target to be searched linearly in the given array

        // linear search function is called
        boolean ans = linearSearch2(arr, target);
        System.out.println(ans);
    }

    // linear search function
    public static int linearSearch (int[] arr, int target) {
        //if the length of array is 0, then we have to return -1
        if (arr.length == 0) {
            return -1;
        }

        // for loop to iterate over each elements in the array
        for (int i = 0; i < arr.length; i++) {

            // check if current element is equal to target
            if (arr[i] == target) {

                // if target found, then return the index
                return i;
            }
        }

        // this line will execute if none of the above return statements have executed
        // hence the target not found
        // -ve index doesn't exist in an array, that's why we are returning -ve value
        return -1;
    }

    // searching -- search the target and return the element itself
    public static int linearSearch1 (int[] arr, int target) {
        //traverse the array
        for (int i = 0; i < arr.length; i++) {
            //check if current element is equal to target
            if (arr[i] == target) {
                //if target found then return the element
                return arr[i];
            }
        }
        //if target is not found then this return statement will execute
        //this return statement returns the possilbe maximum value of an integer.
        return Integer.MAX_VALUE;
    }


    //searching : search the target return true if target found and false if not found
    public static boolean linearSearch2 (int[] arr, int target) {
        //traversre the array
        for (int i = 0; i < arr.length; i++) {
            //check if current element is equal to target
            if (arr[i] == target) {
                // if target found then return true
                return true;
            }
        }
        //if target not found then return false
        return false;
    }
}