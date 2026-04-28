package Assignment_2;

public class Natural_Sum_Q12 {
   public static void main(String[] args) {
       int sum=0;
       int n=100;

       for(int i=1;i<=n;i++)
       {
           sum=sum+i;
       }
       System.out.println("Sum of first "+n+" natural numbers aee: "+sum);
       if(sum%2==0)
       {
           System.out.println("Sum is even");
       }
       else
       {
           System.out.println("Sum is odd");
       }

    }
}
