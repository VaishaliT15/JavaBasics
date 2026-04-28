package Assignment_2;

public class Factorial_Q14 {
    public static void main(String[] args) {
        int n=10;
        long factorial = 1L;

        for(int i=1; i<=10; i++)
        {
           factorial=factorial*i;
        }
        System.out.println("Factorial of "+n+" is: "+factorial);
    }
}
