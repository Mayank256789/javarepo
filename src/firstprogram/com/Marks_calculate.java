package firstprogram.com;

import java.util.Scanner;
public class Marks_calculate {
    public static void main(String[] args) {
        float [] marks = {50,60,70,80,90};
        float sum = 0;
        for(float element : marks) {
            sum += element;
        }
        float average = sum/marks.length;
        System.out.println("The average marks is " + average);
    }
}
