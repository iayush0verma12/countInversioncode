import java.util.*;
import java.util.LinkedList;

public class Graph {
    static class edge{
        int src;
        int des;
        int wt;
        public edge(int src,int des,int wt)
        {
            this.src=src;
            this.des=des;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<edge>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));

        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,3,1));

        graph[2].add(new edge(2,0,1));
        graph[2].add(new edge(2,4,1));

        graph[3].add(new edge(3,1,1));
        graph[3].add(new edge(3,4,1));
        graph[3].add(new edge(3,5,1));

        graph[4].add(new edge(4,2,1));
        graph[4].add(new edge(4,3,1));
        graph[4].add(new edge(4,5,1));

        graph[5].add(new edge(5,3,1));
        graph[5].add(new edge(5,4,1));
        graph[5].add(new edge(5,6,1));

        graph[6].add(new edge(6,5,1));


    }
    public static void dfsUtil(ArrayList<edge>graph[],int curr,boolean vst[])
    {
        //visit
        System.out.print(curr+ " ");
        vst[curr]=true;

        //next
        for(int i=0;i<graph[curr].size();i++)
        {
            edge e = graph[curr].get(i);
            if(!vst[e.des])
            {
                dfsUtil(graph,e.des,vst);
            }
        }

    }
    public static void dfs(ArrayList<edge>graph[])
    {
        boolean vst[]= new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            dfsUtil(graph,i,vst);
        }
    }

    public static boolean dfsSearch(ArrayList<edge>graph[],int source,boolean vst[],int dest)
    {
        //visit
//        System.out.print(QueueUsingLL+ " ");
        if(source==dest)
        {
            return true;
        }
        vst[source]=true;

        //next
        for(int i=0;i<graph[source].size();i++)
        {
            edge e = graph[source].get(i);
            if(!vst[e.des] && dfsSearch(graph,e.des,vst,dest))
            {
                return true;
            }
        }
        return false;

    }
    public static boolean detectCycle(ArrayList<edge>graph[])
    {
        boolean vst[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vst[i])
            {
                if(detectCycleUtil(graph,vst,i,-1))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<edge>graph[],boolean vst[],int curr,int par)
    {

        // next node par and visited true then continue
        //next node par nhi hai aur visited false hai
        //visited false then check for next elements
        vst[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            edge e = graph[curr].get(i);
            if(!vst[e.des] && detectCycleUtil(graph,vst,e.des,curr))
            {
                return true;
            }
            else if(vst[e.des] && e.des!=par)
            {
                return true;
            }
        }
        return false;
    }

    public static void bfs(ArrayList<edge>graph[])
    {
        boolean vst[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vst[i])
            {
                bfsUtil(graph,vst);
            }
        }

    }
    public static void bfsUtil(ArrayList<edge>graph[],boolean vst[])
    {
        Queue<Integer>q=new LinkedList<>();

        q.add(0);

        while(!q.isEmpty())
        {
            int curr = q.remove();
            if(!vst[curr]) {
                System.out.print(curr + " ");
                vst[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }

        }

    }

    public static void main(String[] args) {
//        graph[0].add(new edge(0,1,5));
//        //vertex of 1
//        graph[1].add(new edge(1,2,1));
//        graph[1].add(new edge(1,3,3));
//        graph[1].add(new edge(1,0,5));
//        //vertex of 2
//        graph[2].add(new edge(2,1,1));
//        graph[2].add(new edge(2,3,1));
//        graph[2].add(new edge(2,4,2));
//        //vertex of 3
//        graph[3].add(new edge(3,1,3));
//        graph[3].add(new edge(3,2,1));
//        //vertex of 4
//        graph[4].add(new edge(4,2,2));

//        for(int i=0;i<graph[0].size();i++)
//        {
//            edge e=graph[0].get(i);
//            System.out.println(e.des);
//        }
//        System.out.println();
//        for(int i=0;i<graph[2].size();i++)
//        {
//            edge e=graph[2].get(i);
//            System.out.print(e.des+ " ");
//        }

        int V=7;
        ArrayList<edge>graph[]=new ArrayList[V];
        createGraph(graph);
//        bfs(graph);
        int source=0;
        int dest=5;
        if(dfsSearch(graph,source,new boolean[V],dest))
        {
            System.out.println("Yes Path Exists here!");
        }
        else
        {
            System.out.println("Path does not exists here!");
        }


    }
}
