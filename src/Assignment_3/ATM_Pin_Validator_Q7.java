package Assignment_3;

import java.util.Scanner;

public class ATM_Pin_Validator_Q7 {
    public static void main(String[] args) {
        int correctPin = 4521;
        int attempt=3;
        Scanner sc = new Scanner(System.in);
        int enteredPin;
        while(attempt>=1)
        {

            attempt--;
            System.out.println("Enter the PIN");
            enteredPin=sc.nextInt();
            if(enteredPin==correctPin)
            {
                System.out.println("Access Granted. Welcome!");
                break;
            }
            else
            {
                System.out.println("Incorrect PIN." +attempt+" attempt(s) remaining.");
            }


        }
        if(attempt==0)
        System.out.println("Card Blocked. Contact your bank.");
    }
}
