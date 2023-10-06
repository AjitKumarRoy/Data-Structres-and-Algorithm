//Peak Index in a Mountain Array

import java.util.*;
public class Test8 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,1,0};

        //calling searchTarget function
        int ans = searchTarget(arr);

        System.out.println(ans);
    }

    public static int searchTarget(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //find the middle element
            int mid = start + (end - start) / 2;

             if (arr[mid + 1] > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; //or return end
    }
}