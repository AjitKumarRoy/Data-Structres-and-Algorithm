//Find the i-th bit of a number

import java.util.*;
public class Ajit {
    public static void main(String[] args) {
        int n = 10; //1010

        //calling the ithBit function to find the ith Bit
        System.out.println(ithBit(n, 1));
        System.out.println(ithBit(n, 2));
        System.out.println(ithBit(n, 3));
        System.out.println(ithBit(n, 4));
        System.out.println(ithBit(n, 5));
        System.out.println(ithBit(n, 6));

    }

    public static int ithBit(int n, int i) {
        return (n & (1 << (i-1)));
    }
}