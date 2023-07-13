public class GridProblem {
    static int count=0;
    public static void noOfWays(int grid[][],int i,int j)
    {
        if(i>grid.length-1)
        {
            return;
        }
        if(j>grid[0].length-1)
        {
            return;
        }
        if(i==grid.length-1 && j==grid[0].length-1)
        {
            count++;
            return;
        }
        noOfWays(grid,i+1,j);
        noOfWays(grid,i,j+1);
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int[][] grid = new int[n][m];
        noOfWays(grid,0,0);
        System.out.println(count);
    }
}
