import java.util.*;
public class Connectedgraph {

    public static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int src,int dest,int weight)
        {
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }

    }

    public static void bfs(ArrayList<Edge> graph[])
    {
       
        boolean visited[]=new boolean[graph.length];
        for(int  i=0;i<graph.length;i++)
        {
            if(!visited[i])
            {
                BFSutil(graph, visited);
            }
        }
        
       
    }
        
    public static void BFSutil(ArrayList<Edge> graph[],boolean visited[]) {

        Queue <Integer> q=new LinkedList<>();
       
        q.add(0);

        while(!q.isEmpty())
        {
            int curr=q.remove();

            if(!visited[curr])
            {
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge e=graph[curr].get(i);
                   q.add(e.dest);
                }

            }

        }
        
    }




    public static void dfs(ArrayList<Edge> graph[])
    {
        boolean visited[]=new boolean[graph.length];
        for(int  i=0;i<graph.length;i++)
        {
            if(!visited[i])
            {
             DFSutil(graph,i,visited);
            }
        }

    }



    public static void DFSutil(ArrayList<Edge> graph[],int curr,boolean visited[]) {


        System.out.print(curr+" ");
        visited[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!visited[e.dest])
            {
                DFSutil(graph, e.dest, visited);
            }
        }

       
        
    }

    public static void creategraph( ArrayList<Edge> []graph) {
        
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
       
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));

    
    }



    public static void main(String[] args) {


        int V=7;
        boolean Visited[]=new boolean[V];
        ArrayList<Edge> graph[]=new ArrayList[V];

        creategraph(graph);
       dfs(graph);

    


    }
    
}
