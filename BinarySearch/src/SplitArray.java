import java.util.*;
public class SplitArray {
    public static void main(String[] args){
        int nums[] = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums,m));
    }
    public static int splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++){
            start = Math.max(start,arr[i]);

            end += arr[i];
        }


        //binary search

        while(start < end){
            //try for the middle element as possible ans
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                if(sum + num > mid){
                    //you cannot add this in this subarray, make new one
                    //say you add this in new subarray, then sum = num

                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // here start == end;
    }

}
