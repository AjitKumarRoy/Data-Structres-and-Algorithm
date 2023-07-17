//Linear Search in java


public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {25, 40, 8, -1, 5, 0, -23, 34};
        int target = 5;
        System.out.println(linearSearch2(arr,target));
    }
    //search in the array : return the index if item found otherwise return -1
    public static int linearSearch(int[] arr, int target) {
        //traverse the array
        for (int i = 0; i < arr.length; i++) {
            //check if current element is equal to the target element
            if (arr[i] == target) {
                return i;
            }
        }
        //this line will execute if none of the above return statement have executed
        return -1; // because -ve index doesn't exist in an array
    }

    //search the target and return the element itself
    public static int linearSearch1(int[] arr, int target) {
        //traverse the array
        for (int element : arr) {
            //check if current element is equal to target
            if(element == target) {
                //if target found then return the element
                return element;
            }
        }
        //if target is not found then this return statement will execute
        //this return statement returns the possible minimum value of an integer
        return Integer.MIN_VALUE;
    }

    //search the target and return true if target found and false if target not found
    public static boolean linearSearch2(int[] arr, int target) {
        //traverse the array
        for (int element : arr){
            //check if current element is equal to target
            if (element == target) {
                //if target found then return true
                return true;
            }
        }
        //if target not found then return false
        return false;
    }
}
