package logic;
import java.util.*;
public class OddrEvenBit {
    public static void main(String[] args) {
           Scanner ab = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int num = ab.nextInt();

        if ((num & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
