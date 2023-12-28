// Check if the given no is odd or even

import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        //calling checkEven function
        for (int i = 0; i <= 5; i++) {
            boolean ans = checkEven(i);
            System.out.println(ans);
        }
    }

    //function to check if the given number if odd
    public static boolean checkEven(int n) {
        if (n == 0) {
            return false;
        }
        return ((n & 1) == 0);
    }
}