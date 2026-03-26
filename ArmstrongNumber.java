import java.util.*;

public class ArmstrongNumber {
    static void main(String[] args) {

        Scanner ab = new Scanner(System.in);

        System.out.print("Enter Number To Check Armstrong or Not : ");
        int num = ab.nextInt();

        int OrigNum = num;
        int digit = String.valueOf(num).length();
        int sum = 0;

        while (num > 0){
            int rem = num % 10;
            sum += Math.pow(rem , digit);
            num /= 10;
        }
        if (sum == OrigNum)
            System.out.println("The Given Number "+OrigNum+" is Armstrong");
        else
            System.out.println("The Given Number "+OrigNum+" is Not Armstrong ");
    }
}
