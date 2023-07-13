import java.util.Arrays;

public class Knights {

    static int N=8;

    public static boolean isSafe(int chess[][],int x,int y)
    {
        return (x>=0 && x<N)&& (y>=0 && y<N) &&(chess[x][y]==-1);
    }

    public static boolean SolveKnight()
    {
        int[][] chess =new int[N][N];
        for (int[] ints : chess) {
            Arrays.fill(ints, -1);
        }
        chess[0][0]=0;
        int xMove[]={2,1,-1,-2,-2,-1,1,2};
        int yMove[]={1,2,2,1,-1,-2,-2,-1};
        if(SolveKTUtil(0,0,1,xMove,yMove,chess))
        {
            printChess(chess);
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void printChess(int chess[][])
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean SolveKTUtil(int x,int y,int iMove,int xMove[],int yMove[],int chess[][])
    {
        if(iMove==N*N)
        {
            return true;
        }
        int next_x,next_y,k=0;
        for(k=0;k<8;k++)
        {
            next_x=x+xMove[k];
            next_y=y+yMove[k];
            if(isSafe(chess,next_x,next_y))
            {
                chess[next_x][next_y]=iMove;
                if(SolveKTUtil(next_x,next_y,iMove+1,xMove,yMove,chess))
                {
                    return true;
                }
                else
                {
                    chess[next_x][next_y]=-1;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        SolveKnight();
    }
}
