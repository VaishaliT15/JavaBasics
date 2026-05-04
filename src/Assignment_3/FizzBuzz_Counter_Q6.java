package Assignment_3;

public class FizzBuzz_Counter_Q6 {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=50;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                System.out.print("FizzBuzz ");
                count++;
            } else if (i%3==0) {
            System.out.print("Fizz ");
            }else if (i%5==0) {
            System.out.print("Bizz ");
        }
            else{
            System.out.print(i+" ");
        }
        }
        System.out.print("count: "+count);
    }
}
