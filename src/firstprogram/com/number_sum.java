package firstprogram.com;

import java.util.Scanner;

public class number_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter a no.to find it table");
        int num2 = sc.nextInt();
        int sum = 0;
        for ( int i = 1; i <= num; i++ ) {

            int num3 = 1;
            num3 = num2 * i;
            sum = sum + num3;
        }
        System.out.println(sum);
    }
}
