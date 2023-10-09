//Find the duplicate Number

import java.util.*;
public class DuplicateElement{
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));

        System.out.println(Arrays.toString(arr));
    }

    public static int findDuplicate(int[] arr){
        int i = 0;

        while (i < arr.length) {
            int currentIndex = arr[i] - 1;

            //check if arr[i] is at correctIndex or not
            if (arr[i] != arr[currentIndex]) {
                //swapping
                swap(arr, i, currentIndex);
            }
            //if arr[i] is equal to arr[correctIndex], then just move to the next index
            else {
                i++;
            }
        }

//        //now the array is sorted
//        //just find the missing numbers
//        for(int j = 0; j < arr.length; j++) {
//            if (arr[j] != j+1) {
//                return arr[j]; //this line does the everything
//            }
//        }
//        return -1; //this line does not do anything
//        //you can return -1, if there is no duplicate element


        //or you can also return the last element also
        //because after cyclic sort the element will get sorted
        //and the one duplicate element will be moved to the last index of the array during the sorting process
        return arr[arr.length-1]; //returning last element of the array
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}