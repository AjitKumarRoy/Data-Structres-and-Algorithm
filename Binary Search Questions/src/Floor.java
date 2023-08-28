//Floor :- floor means the biggest number that is smaller than or equal to the target number

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //binary search function
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        //iterate while the value of start is less than or equal to end
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check if the element at middle index is equal to the target
            if (target == arr[mid]) {
                //if target found, then return the middle index
                return mid;
            }
            //if target is smaller than the middle element
            //then search in the left
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            //if target is greater than middle element
            //then search in the right
            else {
                start = mid + 1;
            }
        }
        //here we are going to return the end
        //because end is the biggest number that is smaller than the target number
        return end; // this is the floor i.e. the answer
    }
}