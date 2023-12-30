//Every number is appearing 3 times, and one number is appearing only once
//find that number which is appearing only once

// or,

//Every number is appearing odd number of times, and one number is appearing only once
//find that number which is appearing only once



public class FindUnique2 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3,3,4};
        int ans = magicNumber(arr);

        int result = 0;
        while (ans > 0) {
            int lastDigit = ans % 10;

            result = result * 10 + (lastDigit % 3);
            ans /= 10;
        }

        System.out.println(result);
    }
    //function to find the magic number
    public static int magicNumber(int[] arr) {

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int result = 0;
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > 0) {
                    int lastDigit = (arr[j] & 1);
                    arr[j] = arr[j] >> 1; //digits shifted towards right by 1
                    result = result + lastDigit;
                }
                sum = sum + arr[j];
            }
            ans = (ans * 10) + result;

            if (sum == 0) {
                break;
            }

        }
        return ans;
    }

    //function to reverse the number
    public static int reverseNum(int num) {
        int reverse = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        return reverse;
    }
}