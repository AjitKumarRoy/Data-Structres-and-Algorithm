//Reset i'th bit
// if i'th bit is 1, then turn it to 0
// if i'th bit is 0, then turn it to 0

import java.util.*;
public class ResetithBit {
    public static void main(String[] args) {
        //calling resetBit function
        System.out.println(resetBit(10, 2));
    }

    //function to reset i'th bit
    public static int resetBit(int n, int i) {
        return n & (~(1 << (i-1)));
    }
}