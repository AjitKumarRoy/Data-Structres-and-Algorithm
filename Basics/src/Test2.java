import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        for (int i = 0; i < (arr.length-1) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return 0;
    }


}