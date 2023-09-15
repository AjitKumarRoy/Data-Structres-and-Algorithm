//// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//
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
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'z';

        char ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //binary search function
    //ceiling approach
    public static char binarySearch(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;

        //iterate while the value of start is less than or equal to end
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;



            //if target is less than the middle element
            //then search in the left
            if (target < arr[mid]) {
                end = mid - 1;
            }
            //if target is greater than the middle element
            //then search in the right
            else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
