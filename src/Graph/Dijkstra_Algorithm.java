package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


public class Dijkstra_Algorithm {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Dijkstra_Algorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    class DijkstraPair{
        int vtx;
        String acqPath;
        int cost;
        public DijkstraPair(int vtx , String acq_path , int cost){
            this.vtx = vtx;
            this.acqPath = acq_path;
            this.cost = cost;
        }
        @Override
        public String toString(){
            return vtx + " " + acqPath + " @ " + cost;
        }
    }

    public void Dijkstra(){
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a , b)->a.cost-b.cost);
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new DijkstraPair(1 ,"1" ,0));
        while(!pq.isEmpty()){
            //1. remove
            DijkstraPair rp = pq.poll();
            //2. Ignore if already visited
            if(visited.contains(rp.vtx)){
                continue;
            }
            //3. Marked visited
            visited.add(rp.vtx);
            //4. self work
            System.out.println(rp);
            //5. add nbrs
            for(int nbrs: map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost = map.get(rp.vtx).get(nbrs);
                    pq.add(new DijkstraPair(nbrs, rp.acqPath + nbrs , rp.cost + cost));
                }
            }

        }
    }
    public static void main(String[] args) {
        Dijkstra_Algorithm dj = new Dijkstra_Algorithm(7);
        dj.AddEdge(1, 2, 2);
        dj.AddEdge(2, 3, 3);
        dj.AddEdge(1, 4, 10);
        dj.AddEdge(4, 5, 8);
        dj.AddEdge(3, 4, 1);
        dj.AddEdge(5, 6, 5);
        dj.AddEdge(5, 7, 6);
        dj.AddEdge(6, 7, 4);
        dj.Dijkstra();
    }
}


// disadvantage of Dijkstra_Algorithm is that it doesn't give correct answer in directed graph with  negative weight.