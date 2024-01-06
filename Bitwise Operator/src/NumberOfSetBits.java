//you are given a number, find the no. of set bits in it

import java.util.*;
public class NumberOfSetBits {
    public static void main(String[] args) {
        //calling setBits
        System.out.println(setBits(9));
    }

    //function to count the number of set bits
    public static int setBits(int n) {
        int count = 0;

//        while (n > 0) {
//            count++;
//            n -= (n & -n);
//        }

        while (n > 0) {
            count++;
            n = n & (n-1);
        }
        return count;
    }
}