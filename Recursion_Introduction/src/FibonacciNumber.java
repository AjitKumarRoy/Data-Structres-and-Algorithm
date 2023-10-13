//Find nth fibonacci number

import java.util.*;
public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    //function to find the nth fibonacci number
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n-1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}