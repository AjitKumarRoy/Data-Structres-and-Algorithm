//In an given array every element is repeated twice, you have to find the element which is not repeated twice

import java.util.*;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 2, 4, 5, 2};

        //calling findUnique function
        int ans = findUnique(arr);
        System.out.println(ans);


    }
    //function to find the unique element
    public static int findUnique(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }

        return ans;
    }
}