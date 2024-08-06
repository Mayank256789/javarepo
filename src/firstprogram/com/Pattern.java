package firstprogram.com;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns");
        int m = sc.nextInt();

        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < m) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
