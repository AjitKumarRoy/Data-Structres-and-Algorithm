//Find the nth fibonacci number

import java.util.*;
public class Fibonacci3 {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    //function to find the nth fibonacci number
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}