package logic;

import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter Number to Check Palindrome : ");
        int num = ab.nextInt();

        int Orig = num;
        int reverse = Palind(num);

        if (reverse == Orig)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome(");
    }
    static int Palind (int num){

        int rev = 0;
        while (num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}
