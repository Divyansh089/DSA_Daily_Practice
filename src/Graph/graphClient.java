package Graph;

import java.util.HashSet;

public class graphClient {
    public static void main(String args[]){
        graph g= new graph(7);
        g.AddEdge(1,4,2);
        g.AddEdge(1,2,5);
        g.AddEdge(3,2,7);
        g.AddEdge(3,4,-1);
        g.AddEdge(5,4,3);
        g.AddEdge(5,6,7);
        g.AddEdge(7,6,4);
        g.Display();
        System.out.println(g.HasPath(1 , 6 , new HashSet<>()));
        g.ALLPath(1 , 6, new HashSet<>() , "");


    }
}
