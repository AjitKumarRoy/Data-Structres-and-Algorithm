//Finding square root of a number



//complexity :- O(log n)




import java.util.*;
public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 5; //precision value // matlab kitna deciaml tak correct value chahiye;

        //System.out.println(squareRoot(n,p));
        System.out.printf("%.5f",squareRoot(n,p)); // pretty printing
    }

    //function to find the square root of a number
    public static double squareRoot(int num, int p) {
        int start = 0;
        int end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            //check if mid * mid == num
            if (mid * mid == num) {
                return mid;  //this will return only the perfect squre root
            }
            //search left
            if (mid * mid > num) {
                end = mid - 1;
            }
            //search right
            else {
                start = mid + 1;
            }
        }

        //for square root with decimal value  or, imperfect square root
        //for the square root with decimal value, this will return the value before decimal

        double root = end;
        double increment = 0.1;

        for (int i = 0; i < p; i++) {
            while (root * root <= num) {
                root += increment;
            }

            root -= increment;
            increment /= 10;
        }
        return root;
    }
}