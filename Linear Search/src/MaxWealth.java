////Richest Customer Wealth
////https://leetcode.com/problems/richest-customer-wealth/description/
//
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
//i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts.
//The richest customer is the customer that has the maximum wealth.
//
//
//
//Example 1:
//
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.
//Example 2:
//
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10
//Explanation:
//1st customer has wealth = 6
//2nd customer has wealth = 10
//3rd customer has wealth = 8
//The 2nd customer is the richest with a wealth of 10.
//Example 3:
//
//Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
//Output: 17


import java.util.*;
public class MaxWealth {
    public static void main (String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(linearSearch(arr));
    }


    //function to calculate the maximum wealth
    public static int  linearSearch (int[][] arr) {
        int max = 0; // maximum customer wealth is initialized with zero

        //traverse the array

        for (int row = 0; row < arr.length; row++) {

            int sum = 0; // current customer wealth is initialized with zero

            for (int col = 0; col < arr[row].length; col++) {
                //update current customer wealth
                sum += arr[row][col];
            }

            //check if current customer wealth is greater than the maximum customer wealth
            if (sum > max) {

                //update the maximum customer wealth
                max = sum;
            }
        }
        return max;
    }
}
