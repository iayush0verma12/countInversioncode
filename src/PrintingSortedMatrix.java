public class PrintingSortedMatrix {
    public static void main(String args[])
    {
        int n=3;
//        int arr[n][n]=new int[n][n];
        int arr[][]={{1,3,5},
                     {2,6,9},
                     {3,6,9}};

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    for(int l=0;l<n;l++) {
                        if (arr[k][l] > arr[i][j]) {
                            int temp = arr[k][l];
                            arr[k][l] = arr[i][j];
                            arr[i][j] = temp;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int o=0;
        int temp[]=new int[n*n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[o]=arr[i][j];
                o++;
            }
        }
        int median=0;
        int num=n*n;
        //Finding median
        if(num%2==0)
        {
            median=temp[((num/2)+(num+1/2))/2-1];
        }
        else
        {
            median=temp[(num+1)/2-1];
        }
        System.out.println();
        System.out.print(median);

    }
}