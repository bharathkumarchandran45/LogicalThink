package logic;

import java.util.*;
public class Prime {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = ab.nextInt();

        int flag = 0;
        for (int i=1; i<=num; i++){
            if (num % i == 0)
                flag++;
        }

        if (flag == 2)
            System.out.println("The Given Number "+num+" is Prime");
        else
            System.out.println("The Given Number "+num+" is Not Prime");
        }
    }

