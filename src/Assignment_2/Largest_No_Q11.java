package Assignment_2;

public class Largest_No_Q11 {
    public static void main(String[] args)
    {
        int a=54, b=89, c=73;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a + " is largest no. among all three");
            }
        }
        else if(b>a)
        {
            if(b>c)
            {
                System.out.println(b + " is largest no. among all three");
            }
        }
        else
        {
            System.out.println(c + " is largest no. among all three");
        }
    }

}
