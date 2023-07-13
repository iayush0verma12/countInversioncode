import java.util.Scanner;

public class shortestPAth {
    public static void getShortestPath(String Path)
    {
        int x=0,y=0;
        for(int i=0;i<Path.length();i++)
        {
            char dir=Path.charAt(i);
            if(dir=='S')
            {
                y--;
            }
            else if(dir=='N')
            {
                y++;
            }
            else if(dir=='E')
            {
                x++;
            }
            else if(dir=='W')
            {
                x--;
            }
        }
        int X=x*x;
        int Y=y*y;
        System.out.println(Math.sqrt(X+Y));

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String Path=sc.next();
        getShortestPath(Path);
    }
}