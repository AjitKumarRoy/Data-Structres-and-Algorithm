//XOR of all no's between a & b


import java.util.*;
public class RangeXOR {
    public static void main(String[] args) {
        //calling rangeXOR function
        System.out.println(rangeXOR(3,10));
    }
    //function to calculate XOR from a to b
    public static int rangeXOR(int a, int b) {
        int ans = findXOR(b) ^ findXOR(a-1);

        return ans;
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