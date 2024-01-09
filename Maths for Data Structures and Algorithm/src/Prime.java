// The code snippet checks whether a given number is prime or not, and prints all numbers from 0 to 20 along with their prime status. It uses a function that iterates from 2 to the square root of the number to check for divis
//prime no :- a number that is divisible by 1 and itself.
//e.g:- 2,3,5,7,13


//complexity :- O(root n)


import java.util.*;
public class Prime {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i <= n; i++) {
            System.out.println(i +" "+ checkPrime(i));
        }
    }

    //function to check if a given number is prime or not
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= num) {    // c <= Math.sqrt(num) ----> squared both the sides
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}