//Find the i'th bit of a given no.

import java.util.*;

public class FindithBit {
    public static void main(String[] args) {
        //calling findBit function
        System.out.println(findBit(7,1)); //1'st bit
        System.out.println(findBit(7,2)); //2'nd bit
        System.out.println(findBit(7,3)); //3'rd bit
        System.out.println(findBit(7,4)); //4'th bit
    }

    //function to find the i'th bit of given no from its binary representation

    public static int findBit (int n, int i) {
        return (n >> (i-1)) & 1;
    }

}

























// By Kunal Kushwaha :------

// Find the i'th bit of a given no
//
//import java.util.*;
//public class FindithBit {
//    public static void main(String[] args) {
//        //calling findBit function
//        System.out.println(findBit(10, 4));
//    }
//
//    //function to find the i'th bit of a given number
//    public static int findBit(int n, int i) {
//        return (n & (1 << (i-1))); // (n >> (x-1)) & 1;
//    }
//}