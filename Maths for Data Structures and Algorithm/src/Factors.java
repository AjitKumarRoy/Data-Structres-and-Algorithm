//Factors of a number
// eg:- 20 => 1, 2, 4, 5, 10, 20
// mtlb all the numbers that divides 20

import java.util.*;
public class Factors {
    public static void main(String[] args) {
        int n = 36;

        factors1(n);
        System.out.println();
        factors2(n);
        System.out.println();
        factors3(n);
    }

    //function to print all the factors of given number


    //complexity:- O(n)
    public static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i +" ");
            }
        }
    }


    //complexity:- O(sqrt n)
    public static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) { // for ignoring duplicates
                    System.out.print(i);
                } else {
                    System.out.print(i +" "+ n/i +" ");
                }
            }
        }
    }


    //both time and space will be:- O(sqrt n)
    public static void factors3(int n) {
        //arraylist is declared and initialized
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) { // for ignoring duplicates
                    System.out.print(i+" ");
                } else {
                    System.out.print(i +" ");
                    list.add(n/i); //storing in list
                }
            }
        }

        //printing the elements stored in list
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}