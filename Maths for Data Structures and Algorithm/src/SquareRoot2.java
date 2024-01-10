//Newton Raphson Method to find the square root of number

// root = [x + (N / x)] / 2
// where x = sqrt that you have assumed


import java.util.*;
public class SquareRoot2 {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    public static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n/x));

            if (Math.abs(root - x) < 1) {  //decrease the value of 1  to 0.5, 0.2, 0.1 for higher precision
                break;
            }

            x = root;
        }
        return root;
    }
}