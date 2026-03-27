package logic;

import java.util.*;
public class PalindromeStr {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);

        System.out.print("Enter String to Check Palindrome : ");
        String str = ab.nextLine();

        if (Palind(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Pallindrome");
    }
    static boolean Palind(String str){

        int left = 0;
        int right = str.length()- 1;

        while (left < right){
            char l = Character.toLowerCase(str.charAt(left));
            char r = Character.toLowerCase(str.charAt(right));

            if (l != r)
                return false;
            left++;
            right--;
        }
        return true;
    }
}