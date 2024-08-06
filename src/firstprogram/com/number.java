package firstprogram.com;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter a number");
        for (int i = number; i>0; i--) {
            System.out.print(i);
        }
    }

}
