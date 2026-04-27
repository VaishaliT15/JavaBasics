package Assignment_2;

public class Electricity_Bill_Calculator_Q9 {
    public static void main(String[] args)
    {
        int units=250;
        double total_bill;

        if(units<=100)
        {
            total_bill= units * 1.5;
        } else if (units<=200) {
            total_bill= (100*1.5)+(units-100)*2.5;

        } else if (units<=300) {
            total_bill= (100*1.5)+(100*2.5)+(units-200)*4.0;

        }
        else{
            total_bill= (100*1.5)+(100*2.5)+(100*4.0)+(units-300)*6.0;

        }
        System.out.println("Total bill is: "+total_bill+" for units "+units);
    }

}
