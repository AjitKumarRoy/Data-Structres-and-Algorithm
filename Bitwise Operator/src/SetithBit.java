//Set the i'th bit
// if i'th bit is 0, then turn it to 1
// if i'th bit is 1, then leave it to 1

import java.util.*;
public class SetithBit {
    public static void main(String[] args) {
        //calling setBit
        System.out.println(setBit(10, 1));
    }

    //function to set the i'th bit
    public static int setBit(int n, int i) {
        return n | (1 << (i-1));   // 1 or 1 = 1  ,, 0 or 1 = 1
    }
}