package Assignment_2;

public class Odd_Nos_Count_Q5 {
    public static void main(String[] args)
    {
        int count=0;
        System.out.println("Odd No.s are: ");
        for(int i=1; i<=50;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
                count=count+1;
            }
        }
        System.out.println("Total count of odd no.s are: "+count);
    }
}
