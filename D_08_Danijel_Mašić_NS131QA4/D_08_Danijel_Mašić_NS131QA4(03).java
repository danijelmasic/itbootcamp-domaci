public class matricaRotiranjeDomaci {
   public static void rightRotate(int matrica[][],int n)
    {

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp = matrica[i][j];
                matrica[i][j] = matrica[j][i];
                matrica[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++)
        {

            int low = 0;
            int high = n-1;

            while(low < high)
            {
                int temp = matrica[i][low];
                matrica[i][low] = matrica[i][high];
                matrica[i][high] = temp;

                low++;
                high--;
            }
        }

        System.out.println("Matrica pod 90% je: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrica[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int n=3;

        int matrica[][] = new int[][]{ {1,2,3}, {4,5,6} , {7,8,9} };

        System.out.println("Prvobitna matrica je: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrica[i][j]+" ");
            }
            System.out.println();
        }

        rightRotate(matrica,n);
    }

}

