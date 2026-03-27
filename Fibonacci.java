package logic;

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);

        System.out.print("Enter No.of Series : ");
        int num = ab.nextInt();

        int a=0, b=1;

        for (int i=0; i<num; i++){
            System.out.print(a+" ");
            int temp = a+b;
            b = a;
            a = temp;

        }
    }
}
