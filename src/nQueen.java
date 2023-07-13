public class nQueen {
    static int count=0;

    public static boolean isSafe(char board[][],int row,int j)
    {
        //above row check
        //left and right upper diagonal
        for(int i=row;i>=0;i--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        int l=j;
        for(int i=row;i>=0 && l>=0;i--,l--)
        {
            if(board[i][l]=='Q')
            {
                return false;
            }
        }
        int m=j;
        for(int i=row;i>=0&&m<=board[0].length-1;i--,m++)
        {
            if(board[i][m]=='Q')
            {
                return false;
            }
        }
        return true;
    }
    public static boolean nQueen(char board[][],int row)
    {
        //bc
        if(row==board.length)
        {
//            System.out.println(Arrays.deepToString(board));

//            printBoard(board);
            printBoard(board);
            return true;
        }
        int j=0;
        for(j=0;j<board[0].length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                if(nQueen(board,row+1))
                {
                    return true;
                }
            }
            board[row][j]='x';
        }
        return false;
    }
    public static void printBoard(char [][]board)
    {
        System.out.println("******************************************");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int n=6;
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='x';
            }
        }
        nQueen(board,0);
//        System.out.println("Total Ways to Solve N queens is "+ count);
    }
}

