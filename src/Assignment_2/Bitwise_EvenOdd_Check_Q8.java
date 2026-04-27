package Assignment_2;

public class Bitwise_EvenOdd_Check_Q8 {
    public static void main(String[] args)
    {
        int n=29;
        if ((n&1)==1) {
            System.out.println("Given no is odd");
        }
        else {
            System.out.println("Given no is even");
        }
       /* The binary repreesentatin of numbers:
        Even no end with 0 (e.g 4=0100)
        Odd no end with 1 ( e.g 29=11101)
        so, when we do n&1- if last bit is 1 then result =1 i.e. odd
        if last bit is 0 then result =0 i.e. even*/

    }

}
