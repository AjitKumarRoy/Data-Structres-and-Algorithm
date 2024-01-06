import java.util.*;
public class FastExponentiation {
    public static void main(String[] args) {
        int base = 2;
        int power = 3;
        int result = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                result *= base;
            }

            base *= base;
            power = power >> 1;
        }

        System.out.println(result);
    }
}