//find smallest letter greater than target
//You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
//
//
//
//Example 1:
//
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//Example 2:
//
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
//Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
//Example 3:
//
//Input: letters = ["x","x","y","y"], target = "z"
//Output: "x"
//Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
//


import java.util.*;
public class Test5 {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'a';

        //calling the ceiling function
        char ans = ceiling(arr, target);
        System.out.println(ans);

    }

    //ceiling function
    public static char ceiling (char[] arr, char target) {
//        if (target >= arr[arr.length-1]) {
//            return arr[0];
//        }
        int start = 0;
        int end = arr.length-1;

        //iterate while start is less than or equal to the end
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if target element is less than the mid element
            if (target < arr[mid]) {
                end = mid - 1;
            }
            //check if target element is greater than the mid element
            else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length]; //start i.e ceiling is the answer
    }
}