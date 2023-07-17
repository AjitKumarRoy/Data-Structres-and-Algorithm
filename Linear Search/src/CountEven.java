////even number of digits
//// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//
////Given an array nums of integers, return how many of them contain an even number of digits.
//Input: nums = [12,345,2,6,7896]
//Output: 2
//Explanation:
//12 contains 2 digits (even number of digits).
//345 contains 3 digits (odd number of digits).
//2 contains 1 digit (odd number of digits).
//6 contains 1 digit (odd number of digits).
//7896 contains 4 digits (even number of digits).
//Therefore only 12 and 7896 contain an even number of digits.

import java.util.*;
public class CountEven {
    public static void main (String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(linearSearch(arr));
    }

    //function to count the even no of digits
    public static int linearSearch (int[] arr) {
        int count = 0; //count variable is initialised to zero

        //traverse the array
        for (int i = 0; i < arr.length; i++) {
            int digits = countDigits1(arr[i]);

            //check if the current element contains even no of digits
            if (isEven(digits)) {

                //update the count variable
                count++;
            }
        }
        //return the count varaible
        //i.e the no of elemetns that contains even no of digits
        return count;
    }

    //function to find the no of digits
    public static int countDigits (int num) {
        if (num == 0) {
            return 1;
        }

        if (num < 0) {
            num *= -1;
        }

        int count = 0; //count variable for counting the no of digits

        //iterate while num is not equal to zero
        while (num > 0) {
            num = num / 10; //removing the last digit from the num

            //update the count variable
            count++;
        }
        //return the no of digits
        return count;
    }

    //shortcut to find the no of digits
    public static int countDigits1 (int num) {
        if (num == 0) {
            return 1;
        }

        if (num < 0) {
            num *= -1;
        }
        return (int)Math.log10(num) + 1;
    }



    //function to check if the number is even or odd
    public static boolean isEven (int num) {
        return (num % 2 == 0);
    }
}
