//Find XOR of no's from 0 to a
//a      XOR from 0 to a
//0       0
//1       1
//2       3
//3       0
//4       4
//5       1
//6       7
//7       0
//8       8
//9       1

// observe the pattern above
// if a % 4 == 0  , then return a
// if a % 4 == 1  , then return 1
// if a % 4 == 2  , then return a+1
// if a % 4 == 3  , then return 0

import java.util.*;
public class FindXOR {
    public static void main(String[] args) {
        //calling findXOR function
        System.out.println(findXOR(4));
    }
    //function to find the XOR from 0's till a
    public static int findXOR(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a+1;
        }

        return 0; // if (a % 4 == 3)
    }
}