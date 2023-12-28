//Find the position of the right most set bit

import java.util.*;
public  class Test2 {
    public static void main(String[] args) {
        //calling function
        System.out.println(position(10));
    }

    //function to find the position of the right most set bit
    public static int position (int n) {
        int a = 1;
        int count = 1;

        while (true) {
            a = a << 1;
            count++;

            if ((n & 1) == 1) {
                return count;
            }
        }
    }
}