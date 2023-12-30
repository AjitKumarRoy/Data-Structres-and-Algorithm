//You are given a number find out if it is power of 2 or not.
//2 -> 10
//4 -> 100
//8 -> 1000


//if n & (n-1) == 0, then it is power of 2;
//because power of 2 can be written as,
// 100 = 11 + 1
// 1000 = 111 + 1
// 10000 = 1111 + 1


import java.util.*;
public class PowerOF2 {
    public static void main(String[] args) {
        //calling checkPowerOf2
        System.out.println(checkPowerOf2(31));
    }
    //function to check if the given no. is power of 2
    public static boolean checkPowerOf2(int n) {
        if (n == 0) {
            return false;
        }
        return (n & (n-1)) == 0;
    }
}







//import java.util.*;
//public class PowerOF2 {
//    public static void main(String[] args) {
//        //calling checkPowerOf2
//        System.out.println(checkPowerOf2(8));
//    }
//
//    //function to check if a given is power of 2 or not
//    //power of 2 contains only one 1's in its binary representation,
//    public static boolean checkPowerOf2(int n) {
//        int countOne = 0;
//
//        while (n > 0) {
//            if ((n & 1) == 1) {
//                countOne++;
//            }
//            n = n >> 1; //digits are shifted towards right by one;
//        }
//        return countOne == 1;  //if it contains more than one 1's then it will return false;
//    }
//}