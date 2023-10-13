//Good example to understand Recursion

import java.util.*;
public class Example {
    public static void main(String[] args) {
        number(5);
    }

    public static void number(int n) {
        number1(n-1);
        System.out.println(n);
    }

    public static void number1(int n) {
        number2(n-1);
        System.out.println(n);
    }
    public static void number2(int n) {
        number3(n-1);
        System.out.println(n);
    }

    public static void number3(int n) {
        number4(n-1);
        System.out.println(n);
    }

    public static void number4(int n) {
        System.out.println(n);
    }
}