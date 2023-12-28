//Find the i'th bit of a given no

import java.util.*;
public class FindithBit {
    public static void main(String[] args) {
        //calling findBit function
        System.out.println(findBit(10, 4));
    }

    //function to find the i'th bit of a given number
    public static int findBit(int n, int i) {
        return (n & (1 << (i-1))); // (n >> (x-1)) & 1;
    }
}