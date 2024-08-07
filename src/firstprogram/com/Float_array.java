package firstprogram.com;

public class Float_array {
    public static void main(String[] args) {
        float [] numbers = {10.5f,20.2f,30.5f,40.5f,50.7f,50.9f,60.2f,70.9f,80.9f,90.2f};
        float sum = 0;
        for(float element : numbers){
            sum += element;
        }
        System.out.println(sum);

        }

    }

