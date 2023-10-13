//Check if a given string is palindrome or not

public class Palindrome2 {
    public static void main(String[] args) {
        String str = "raqecar";

        System.out.println(checkPalindrome(str));
    }

    //function to check if a given string is palindrome
    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            //check if character at start and character at end are not equal
            if (str.charAt(start) != str.charAt(end)) {
                //if they are not equal, then just return false
                return false;
            }

            //increment start
            start++;
            //decrement end
            end--;
        }
        //if we are out of this loop, that means it is a palindrome
        return true;
    }
}