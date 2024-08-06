package firstprogram.com;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number");
        int num1 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int num2 = num1 * i;
            System.out.println(num2);
        }

    }
}
