package Assignment_2;

public class Digital_Sum_Q2 {
    public static void main(String[] args) {
        int n = 4567;
        int sum = 0;
        int r=0;
        while (n != 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r;
        }
        System.out.println("Sum of digits = "+sum);
    }
}
