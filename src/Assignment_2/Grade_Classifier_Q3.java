package Assignment_2;

public class Grade_Classifier_Q3 {
    public static void main(String[] args)
    {
        int marks=32;
        String grade="";
        if(marks>=90 && marks <=100)
        {
            System.out.println("Grade is 'O-Outstanding' ");
        }
        else if(marks>75 && marks <=89)
        {
            System.out.println("Grade is 'A' ");
        }
        else if(marks>=60 && marks <=74)
        {
            System.out.println("Grade is 'B' ");
        }
        else if(marks>=45 && marks <=59)
        {
            System.out.println("Grade is 'C' ");
        }
        else
        {
            System.out.println("Grade is Fail");
        }

    }

}
