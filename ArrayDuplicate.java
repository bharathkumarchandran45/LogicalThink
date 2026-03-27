package logic;

import java.util.*;
public class ArrayDup {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = ab.nextInt();

        if (size<= 0 || size > 1000000000)
            System.out.println("Invalid! Enter Number Between 1 to 1000000000");
        else {
            System.out.println("Enter Array Elements : ");

            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++)
                arr[i] = ab.nextInt();

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            int index = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    arr[index] = arr[i];
                    index++;
                }
            }
            arr[index] = arr[arr.length - 1];
            for (int i = 0; i <= index; i++)
                System.out.print(arr[i] + " ");
        }
    }
}