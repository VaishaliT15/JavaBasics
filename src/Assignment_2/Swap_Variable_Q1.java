package Assignment_2;

public class Swap_Variable_Q1 {
    public static void main(String[] args)
    {
        int a=45, b=78;
        System.out.println("Before swapping the value of a s: "+a+" & value of b is: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping the value of a s: "+a+" & value of b is: "+b);
            }

}
