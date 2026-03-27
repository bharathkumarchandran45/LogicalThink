package logic;

import java.util.*;
public class Factorial {
    public void main(String[] args) {

        Scanner ab = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = ab.nextInt();

        int fact = 1;
        for (int i=1; i<=num; i++)
            fact *= i;

        System.out.println("The Factorial of the "+num+" is "+fact);
    }
}
