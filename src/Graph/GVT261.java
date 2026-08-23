package Graph;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GVT261 {
    public static HashMap<Integer , List<Integer>> map = new HashMap<>();

    public static void main(String args[]){
        int n  = 5;
        int [][]e = {{0,1},{0,2},{0,3} ,{2,3},{1,4}};
        System.out.println(validTree(n ,e));
    }
    public static boolean validTree(int n , int[][] e){
        // no cycle , not disConnected
        for(int i  =0;i<n;i++){
            map.put(i , new ArrayList<>());
        }
        for(int i =0;i<e.length;i++){
            int v1 = e[i][0] , v2 = e[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }

        Queue<Integer> q = new LinkedList<>(); // BFT START HERE
        HashSet<Integer> visit = new HashSet<>();
        int c =0;
        for(int i  = 0;i<n;i++){
            if(visit.contains(i)) continue;
            c++;
            q.add(i); // initial add
            while(!q.isEmpty()){ // BFS START HERE
                int rv = q.poll(); // 1. remove
                if(visit.contains(rv)) return false; // 2. ignore
                visit.add(rv); // 3. maked visited
                for(int nbrs: map.get(rv)){ // 4. add unvisited nbrs
                    if(!visit.contains(nbrs)){
                        q.add(nbrs);
                    }
                }


            }
        }
        return c ==1;

    }
}
