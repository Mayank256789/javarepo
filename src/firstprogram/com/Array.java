package firstprogram.com;

public class Array {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,4,4,4,5,5,5};
        /*numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;*/

        //for (int i = 0; i < numbers.length; i++) {
          //  System.out.println(numbers[i]);
       // }
        //for (int i =numbers.length-1; i >= 0; i--) {
           // System.out.println(numbers[i]);
       // }
        //for each loop in java.
        for (int element : numbers) {
            System.out.println(element);
        }
    }
}
