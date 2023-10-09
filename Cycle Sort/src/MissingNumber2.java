// find the missing number
//one or more than one number can be missing

import java.util.*;
public class MissingNumber2 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        //calling cycleSort function
        System.out.println(cycleSort(arr));
    }

    //cycle sort function to find the missing number from array
    //containing the elements from 1 to n, where n is the length of array
    public static List<Integer> cycleSort(int[] arr) {
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

        //now the array is sorted
        //just find the missing numbers
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                ans.add(j+1);
            }
        }
        return ans;
    }

    //function to swap the two elements in an array
    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}