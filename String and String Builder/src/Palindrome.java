//Check if a String is Palindrome or not

public class Palindrome {
    public static void main(String[] args) {
        String str = "HEHH";

        System.out.println(checkPalindrome(str));
    }

    //function to check if a given string is palindrome
    public static boolean checkPalindrome(String str) {
        //traverse till half of the string
        for (int i = 0; i <= (str.length()/2); i++) {
            //compare the first character with last
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                //if character doesn't match, then it is not a palindrome
                return false;
            }
        }
        //if we are out of this loop, that means the given string is a palindrome
        return true;
    }
}