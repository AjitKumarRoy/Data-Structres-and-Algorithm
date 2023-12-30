// Number of Digits

// log(base b) a = x
// => a = b^x

// log(base 2) 10 = 3.32
// => 10 = 2^3.32
// int(3.32) + 1 = 4 (which is no of digits in the binary representation of 10 i.e. 1010)


//formula
// no. of digits in base b of no. n == int[ log(base b) n ]  + 1

import java.util.*;

public class NoOfDigits {
    public static void main(String[] args) {
        int num = 10;
        int base = 10;

        System.out.println(noOfDigits(num, base));

    }
    //function to find the number of digits
    public static int noOfDigits(int n, int b) {
        return (int)(Math.log(n) / Math.log(b)) + 1;
    }
}