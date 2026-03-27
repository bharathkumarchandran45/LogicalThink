package logic;
import BuiltInCodes.OneDim;

import java.util.Arrays;
public class Descending {
    public static void main(String[] args) {
        OneDim obj = new OneDim();
        int arr[] = obj.Get();
        Arrays.sort(arr);
        for (int i=0; i<arr.length ; i++)
            System.out.print(arr[i]+" ");
    }
}