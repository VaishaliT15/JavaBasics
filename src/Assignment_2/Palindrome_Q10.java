package Assignment_2;

public class Palindrome_Q10 {
    public static void main(String[] args)
    {
        int n=1221;
        int original_value=n;
        int reverse_value=0;

        for(;n>0;n=n/10)
        {
            int digits=n%10;
            reverse_value=(reverse_value*10)+digits;

        }
        if (reverse_value==original_value)
        {
            System.out.println("Given no is palindrome");
        }
        else {
            System.out.println("Given no is not palindrome");
        }
    }

}
