package Arrays;

public class Multidimesional_Array {
    public static void main(String[] args) {
        String[][] envconfig = {
                {"Dev", "Dev.google.com", "Active"},
                {"QA", "QA.google.com", "Active"},
                {"Prod", "Prod.google.com", "Inactive"},
                {"Staging", "Staging.google.com", "Inactive"},
                {"UAT", "UAT.google.com", "Active"}
        };

        for(int i=0;i<envconfig.length;i++)
        {
            for(int j=0;j<envconfig[i].length;j++)
            {
                System.out.printf(envconfig[i][j]);
                System.out.printf(" ");
            }
            System.out.println();
        }

    }
}
