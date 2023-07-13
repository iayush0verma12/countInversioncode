public class maze {

    public static boolean mazeS(int maze[][])
    {
        int fmaze[][]=new int[4][4];
        if(mazeSolve(maze, fmaze, 0, 0))
        {
            printSolved(fmaze);
            return true;
        }
        else {
            System.out.println("Solution Doesn't exists here!");
            return false;
        }

    }
    public static boolean isSafe(int maze[][],int x,int y)
    {
        return (x>=0 && x<=maze.length-1)&&(y>=0&&y<=maze.length-1)&&(maze[x][y]==1);
    }
    public static boolean mazeSolve(int maze[][],int fmaze[][],int row, int col)
    {
        if(row==maze.length-1 && col==maze[0].length-1 && maze[row][col]==1)
        {
            fmaze[row][col]=1;
            return true;
        }
        if(isSafe(maze,row,col))
        {
//            if(fmaze[row][col]==1)
//            {
//                return false;
//            }
            fmaze[row][col]=1;
            if(mazeSolve(maze,fmaze,row+1,col))
            {
                System.out.println("R");
//                return true;
            }
            if(mazeSolve(maze,fmaze,row,col+1))
            {
                System.out.println("D");
//                return true;
            }
            fmaze[row][col]=0;
            return false;
        }
        return false;
    }
    public static void printSolved(int fmaze[][])
    {
        for(int i=0;i<fmaze.length;i++)
        {
            for(int j=0;j<fmaze[0].length;j++)
            {
                System.out.print(fmaze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int maze[][]={ { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 } };
        mazeS(maze);
    }
}
