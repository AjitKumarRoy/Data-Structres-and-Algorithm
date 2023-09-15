import java.util.*;
public class SearchString {
    public static void main(String[] args) {
        String str = "Ajit";
        char target = 'A';
        System.out.println(linearSearch1(str, target));
    }

    //search the target : return the index if target found
    public static int linearSearch(String str, char target) {
        //traverse the array
        for (int i = 0; i < str.length(); i++) {
            //check if current element is equal to target
            if (target == str.charAt(i)) {
                //if target found then return the index
                return i;
            }
        }
        //if target not found the return -1
        //if none of the above return statements is executed then this return statement will execute
        return -1;
    }

    //search the target : return true if target found otherwise false if not found
    public static boolean  linearSearch1 (String str, char target) {
        //traverse the array
        //here for-each loop is used to traverse the array
        for (char element : str.toCharArray()) {
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
