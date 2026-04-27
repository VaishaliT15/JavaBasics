package Assignment_2;

public class Multiplication_Table_Q4 {
    public static void main(String[] args)
    {
        int n=7;
        int mul=0;
        for(int i=1;i<=12;i++)
        {
            mul=n*i;
            System.out.println(n +" x "+ i + " = "+mul);
        }
    }
}
