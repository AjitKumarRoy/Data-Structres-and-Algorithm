//Find the position of the right most set bit



import java.util.*;
public class RightMostSetBit {
    public static void main(String[] args) {
        //calling rightMostSetBit
        for (int i = 0; i <= 20; i++) {
            System.out.println(rightMostSetBit(i));
        }

    }

    //function to find the right most set bit
    public static int rightMostSetBit(int n) {
        int ans = n & (-n);
        //-n is nothing just 2's complement
        //2's complement gives the -ve of a number, in binary representation


        return (int)(Math.log(ans) / Math.log(2)) + 1;
        //log(base a) b  =  log (base 10) b/ log (base 10) a;
    }
}



















//
////By me :-----------
//
//import java.util.*;
//public class RightMostSetBit {
//    public static void main(String[] args) {
//        //calling rightMostSetBit
//        int ans = rightMostSetBit(1010);
//
//        if (ans == -1) {
//            System.out.println("There's no set bit");
//        } else {
//            System.out.println(ans);
//        }
//    }
//
//    //function to find the right most set bit
//    public static int rightMostSetBit (int n) {
//        //if the number is 0, there is no set bit
//        if (n == 0) {
//            return -1;
//        }
//
//        int position = 1;
//        while ((n & 1) != 1) {
//            n = n >> 1;
//            position++;
//        }
//        return position;
//    }
//}