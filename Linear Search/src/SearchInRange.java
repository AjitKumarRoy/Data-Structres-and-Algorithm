import java.util.*;
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {3, 23, 52, -22, -2, 0, 34};
        int target = 23;
        System.out.println(linearSearch(arr,target,0,3));
    }
    //function to search in the given range
    public static int linearSearch (int[] arr, int target, int sIndex, int eIndex) {
        if (arr.length == 0) {
            return -1;
        }
        //traverse the array for given range
        for (int i = sIndex; i <= eIndex; i++) {
            //check if current element is equal to target
            if (target == arr[i]) {
                //if target found then return the index
                return i;
            }
        }
        //if target not found then return -1
        //if none of the above return statement is executed then this return statement will execute at the end
        return -1;
    }
}
