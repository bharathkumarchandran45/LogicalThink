package logic;

import java.util.*;
import BuiltInCodes.TwoDim;
public class MatMul {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);
        TwoDim obj = new TwoDim();

        int m1[][] = obj.getMatrix();
        int m2[][] = obj.getMatrix();

        int r1 = m1[0].length;
        int c1 = m1[1].length;
        int r2 = m2[0].length;
        int c2 = m2[1].length;
        int res[][] = new int[r1][c2];

        if (c1 != r2) {
            System.out.println("Matrix Multiplication is not Possible");
        } else {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        res[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
            System.out.println("Resultant Matrix ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}