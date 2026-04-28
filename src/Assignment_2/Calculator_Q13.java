package Assignment_2;

public class Calculator_Q13 {
    public static void main(String[] args) {
        int num1=20, num2=5, result=0;
        char operator='/';
        boolean isvalid=true;

        switch(operator)
        {
            case '+': result=num1+num2;
            break;
            case '-': result=num1-num2;
            break;
            case '*': result=num1*num2;
            break;
            case '/': if(num2==0)
            {
                System.out.println("Division by zero not possible as it leads to infinite value");
                isvalid=false;

            }
                else
            {
                result=num1/num2;
            }
                break;
            default:
                System.out.println("Invalid operator");
                isvalid=false;

        }
        if(isvalid) {
            System.out.println("Result of " + num1 + operator + num2 + " is: " + result);
        }
    }
}
