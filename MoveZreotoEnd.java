package logic;

import java.util.*;
public class MoveZeros {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = ab.nextInt();

        System.out.println("Enter Array Element :");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = ab.nextInt();

        ZerotoEnd(arr);

    }

    public static void ZerotoEnd(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        System.out.print(Arrays.toString(arr));
    }
}