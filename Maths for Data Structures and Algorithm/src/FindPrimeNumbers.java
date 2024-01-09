//Find all the prime numbers less than equal to N.
//N is given to you


//space complexity :- O(n)
//time complexity :- O(N * log(logN))

import java.util.*;
public class FindPrimeNumbers {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1]; //(n+1) because array index starts from 0 to (n-1)

        //calling the primeRange function
        primeRange(n, primes);
    }

    //initially false is already stored in all the elements of the boolean array
    //so, let's consider false in array means number is prime
    public static void primeRange(int n, boolean[] prime) {
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                //now turn all the multiples of i to true, as they are not prime
                for (int j = i*2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }


        //now print the prime numbers
        //the element in the array which stores, false --> their index are the prime numbers
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}