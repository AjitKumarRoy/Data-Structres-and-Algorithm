//Given a no. n find if it is odd or even

import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        int n = 2;

        //calling checkOdd function
        boolean ans = checkOdd(n);
        //if ans is equal to true, then it is odd
        //if ans is equal to false, then it is even

        if (ans == false) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
    //function to check if the given no. is odd or even

    public static boolean checkOdd(int n) {
        return (n & 1) == 1;
    }
}





//// Check if the given no is odd or even
//
//import java.util.*;
//public class OddEven {
//    public static void main(String[] args) {
//        //calling checkEven function
//        for (int i = 0; i <= 5; i++) {
//            boolean ans = checkEven(i);
//            System.out.println(ans);
//        }
//    }
//
//    //function to check if the given number if odd
//    //if the checkEven function returns true then it is even, else false
//    public static boolean checkEven(int n) {
//        if (n == 0) {
//            return false;
//        }
//        return ((n & 1) == 0);
//    }
//}