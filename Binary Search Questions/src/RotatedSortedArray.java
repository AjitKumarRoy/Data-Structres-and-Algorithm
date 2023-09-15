public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,0,1,2};
        int target = 0;

        int ans = rotatedSortedArray(arr,target);
        System.out.println(ans);
    }

    //
    public static int rotatedSortedArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid+1] < arr[mid] && arr[mid] > arr[mid-1]) {
                return mid;
            }

            if (arr[mid+1] > arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            }
            else if (arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]) {
                return mid-1;
            }
            else if (arr[mid+1] > arr[mid] && arr[mid] > arr[mid-1] && arr[start] > arr[end]) {
                return mid - 1;
            }
            else {
                end = mid;
            }
        }
        return -1;
    }
}
