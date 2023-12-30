//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1

//Find the sum of the n'th row :----(using Bit manipulation)

//sum of n'th row = 2^(n-1)

import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 3;

        //calling pascalsTriangle
        System.out.println(pascalsTriangle(n));
    }
    //function to find the sum of the n'th row of pascal's triangle
    public static int pascalsTriangle(int n) {
        return (1 << (n-1));
    }
}