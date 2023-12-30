////Find the nth magic number////Find the nth magic number


// 1st magic number = 0  0  1  -----> 5    ( 5^3  + 5^2 + 5 ^1)
// 2nd magic number = 0  1  0  -----> 25   ( 5^3  + 5^2 + 5 ^1)
// 3rd magic number = 0  1  1  -----> 30   ( 5^3  + 5^2 + 5 ^1)
// 4th magic number = 1  0  0  -----> 125  ( 5^3  + 5^2 + 5 ^1)
// 5th magic number = 1  0  1  -----> 135  ( 5^3  + 5^2 + 5 ^1)


import java.util.*;
public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;

        int ans = 0;
        int base = 5; // we change as per the question
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}














//
//By me ---------
//
//
//import java.util.*;
//public class MagicNumber {
//    public static void main(String[] args) {
//        //calling magicNumber
//        for (int i = 1; i <= 6; i++) {
//            System.out.println(magicNumber(i));
//        }
//    }
//    //function to find the magic number
//    public static int magicNumber(int n) {
//        int result = 0;
//        int power = 1;
//        while (n > 0) {
//            int lastDigit = (n & 1);
//            n = n >> 1; //digits shifted towards right by 1
//            result = result + lastDigit * (int)Math.pow(5, power);
//            power++;
//        }
//        return result;
//    }
//}

