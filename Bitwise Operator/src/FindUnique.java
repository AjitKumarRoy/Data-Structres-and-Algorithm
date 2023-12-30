//Every no is appearing even times, and one number is appearing odd times.
//Find that number which is appearing odd times.

//Every no. is appearing twice, and one number is appearing once.
//Find that number which is appearing once.


import java.util.*;
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 4, 5, 2};

        //calling findUnique function
        System.out.println(findUnique(arr));

    }

    //function to find the number which is appearing once or odd no of times
    //we know a^a = 0
    //xor is also known as odd 1's detector
    //System.out.println(2^2^2^2^2);  // output is 2, because 2 is appearing odd no of times
    //System.out.println(2^2^2^2);  //output is 0, because 2 is appearing even no of times.

    public static int findUnique(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
////In an given array every element is repeated twice, you have to find the element which
// is not repeated twice
