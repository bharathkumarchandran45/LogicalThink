package logic;

import java.util.*;
public class CountDigits {
    public static void main(String[] args) {

        Scanner ab = new Scanner (System.in);

        System.out.print("Enter Number to Count Digits : ");
        int num = ab.nextInt();

        int orig = num;
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        System.out.println("Digits in The Given Number "+orig+" is "+count);
    }
}
