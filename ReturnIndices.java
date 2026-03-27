package logic;

import BuiltInCodes.*;
import java.util.*;
public class ReturnIndices {
    public static void main(String[] args) {

        OneDim obj = new OneDim();
        int arr[]  = obj.Get();
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter Target : ");
        int tar = ab.nextInt();

        twoSum(arr, tar);
    }

    public static void twoSum(int arr[], int tar) {

        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j] == tar){
                    System.out.print(i+" "+j);
                    return;
                }
            }
        }
        System.out.println("No Solution");
    }
}

//Time Complexiety of the Program is O(n).This is Brute Force Method
//Another Possible Way is also there that is "Hashmap".