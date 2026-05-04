package Assignment_3;

public class Array_Print_Q3 {
    public static void main(String[] args) {
        int[] marks = {85, 92, 67, 78, 55, 90};

        for(int i=0;i< marks.length;i++)
        {
            System.out.println("index "+i+" : "+marks[i]);
        }
        System.out.println("Total elemets: "+marks.length);
    }
}
