package Assignment_3;

public class RowSum_ColMax_Q10 {
    public static void main(String[] args) {
        int[][] data = {
                {12, 45, 33},
                {28, 16, 54},
                {71, 39, 22}
        };
        int sum=0;
        int max=0;


        for (int i=0;i<data.length;i++)
        {
            sum=0;
            for (int j=0;j<data[i].length;j++)
            {
                sum=sum+data[i][j];
            }
            System.out.println("Row "+i+ " Sum: "+sum);

        }

        for (int col=0;col<data.length;col++)
        {
            max = data[0][col];
            for (int row=0;row< data.length;row++)
            {
            if((data[row][col])>max)
            {
                max=data[row][col];
            }
            }

            System.out.println("Column "+col+ " Max: "+max);
        }
    }
}
