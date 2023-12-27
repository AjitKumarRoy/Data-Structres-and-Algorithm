//Find the nth fibonacci number with the help of fibonacci formula

import java.util.*;
public class FiboFormula {
    public static void main(String[] args) {
        for (int i = 0; i <= 5000; i++) {
            long ans = fiboFormula(i);
            System.out.println(ans);
        }
    }

    public static long fiboFormula (int n) {
        return (long)((Math.pow(((1+Math.sqrt(5))/2), n) - Math.pow(((1-Math.sqrt(5))/2), n)) / Math.sqrt(5));
    }
}