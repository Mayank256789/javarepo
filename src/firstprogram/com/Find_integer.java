package firstprogram.com;
public class Find_integer {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println(i);
            }

        }


    }
}
