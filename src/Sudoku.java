public class Sudoku {

    public static boolean isSafe(int sudoku[][],int row,int col,int digit)
    {
        for(int i=0;i<=8;i++)
        {
            if(sudoku[i][col]==digit)
            {
                return false;
            }
        }
        for(int j=0;j<=8;j++)
        {
            if(sudoku[row][j]==digit)
            {
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(sudoku[i][j]==digit)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col)
    {
        //bc
        if(row==9 && col==0)
        {
            return true;
        }
        int nextRow=row;
        int nextCol=col+1;
        if(col+1==9)
        {
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0)
        {
            return sudokuSolver(sudoku,nextRow,nextCol);
        }
        for(int i=1;i<=9;i++)
        {
            if(isSafe(sudoku,row,col,i))
            {
                sudoku[row][col]=i;
                if(sudokuSolver(sudoku,nextRow,nextCol))
                {
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][])
    {
        for(int i=0;i<sudoku.length;i++)
        {
            for(int j=0;j<sudoku[0].length;j++)
            {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        for(char c='1';c<='9';c++)
        {
            System.out.println(c);
        }

        int sudoku[][]={{0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}};
        System.out.println();
        if(sudokuSolver(sudoku,0,0))
        {
            System.out.println("Yes It can be Solved!");
            printSudoku(sudoku);
        }
        else
        {
            System.out.println("No i think printing this is not possible!");
        }
    }
}
