//find minimum item in an array

import java.util.*;
public class MinItem {
    public static void main (String[] args) {
        int[] arr = {-900, 23, 2, 1, 0, 34, -2, -234, 84, -890};
        System.out.println(linearSearch(arr));
    }
    //function to find the minimum item in the array
    public static int linearSearch (int[] arr) {
        int min = Integer.MAX_VALUE; // value of min variable is initialized with the maximum possible value of integer

        //traverse the array
        for (int i = 0; i < arr.length; i++) {
            //check if current element is less than min variable
            if (arr[i] < min) {
                //if current element is less than min variable then assign it to min variable
                //so update min variable
                min = arr[i];
            }
        }
        //return the minimum item
        return min;
    }
}
