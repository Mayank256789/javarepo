package firstprogram.com;

public class Method_logic {

    public static int addition (int x , int y)
    {
        return x+y;
    }
    public static int multiplication (int x1 , int x2)
    {
        return x1*x2;
    }


     public static void main(String[] args) {
         int a1 =2;
         int a2 =3;
         int c = addition(a1,a2);
         int x1 = 5;
         int x2 = 6;
         int c2 = multiplication(x1,x2);
         System.out.println(c);
         System.out.println(c2);
     }
}
// for a static method only static method will be called
