package Graph;

import java.util.*;
public class BellManFord {
    private HashMap<Integer , HashMap<Integer , Integer>> map;

    public BellManFord(int v){ // number of vertex
        map  = new HashMap<>();
        for(int i =1;i<=v;i++){
            map.put(i , new HashMap<>());
        }
    }
    public  void AddEdge(int v1 , int v2 , int cost){
        map.get(v1).put(v2 , cost);

    }
    class EdgePair{
        int v1;
        int v2;
        int cost;
        public EdgePair(int v1 , int v2 , int cost){
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
    }

    public List<EdgePair> getAllEdge(){
        List<EdgePair> ll = new ArrayList<>();
        for(int v1: map.keySet()){
            for(int v2: map.get(v1).keySet()){
                int cost = map.get(v1).get(v2);
                ll.add(new EdgePair(v1 , v2 ,cost));
            }
        }
        return ll;
    }

    public void BellMan_Ford(){
        int v = map.size();
        int [] dis = new int[v +1];
        for(int i = 2;i< dis.length;i++){ // no. of vertex start from 1 & 1 to 1 dist. is 0  , that's why 2
            dis[i] = 99999999;
        }
        List<EdgePair> ll = getAllEdge();
        for(int i = 1 ;i<=v;i++){
            for(EdgePair ep : ll){
                if(i == v && dis[ep.v2] > dis[ep.v1] + ep.cost){ // -ve weight cycle detection
                    System.out.println("-ve weight ka cycle hai");
                    return;
                }
                if(dis[ep.v2] > dis[ep.v1] + ep.cost){ // relaxing edge
                    dis[ep.v2] = dis[ep.v1] + ep.cost;
                }
            }
        }

        for(int i  = 1;i<=v;i++){ // printing minimum dist.
            System.out.print(dis[i] +  " ");
        }
    }

    public static void main(String[] args) {
        BellManFord bf = new BellManFord(5);
        bf.AddEdge(1, 2, 8);
        bf.AddEdge(1, 3, 4);
        bf.AddEdge(1, 4, 5);
        bf.AddEdge(2, 5, 2); // -2 del ka cycle aayega
        bf.AddEdge(5, 2, 1);
        bf.AddEdge(3, 4, -3);
        bf.AddEdge(4, 5, 4);
        bf.BellMan_Ford();
    }
}