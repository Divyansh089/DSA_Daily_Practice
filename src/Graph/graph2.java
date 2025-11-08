package Graph;

import java.util.*;

public class graph2 {
    private HashMap<Integer , HashMap<Integer , Integer>> map;

    public boolean BFS(int src , int des){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
            int r = q.poll(); // 1 remove
            if(visited.contains(r)){ //2. Ignore if already visited
                continue;
            }
            visited.add(r); // 3. Marked visited
            if(r == des){ // 4. self work
                return true;
            }

            for (int nbrs:map.get(r).keySet()){ // 5. add unvisited nbrs
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }

        }
        return false;
    }

    public boolean DFS(int src , int des){
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.add(src);
        while(!st.isEmpty()){
            int r = st.pop(); // 1 remove
            if(visited.contains(r)){ //2. Ignore if already visited
                continue;
            }
            visited.add(r); // 3. Marked visited
            if(r == des){ // 4. self work
                return true;
            }

            for (int nbrs:map.get(r).keySet()){ // 5. add unvisited nbrs
                if(!visited.contains(nbrs)){
                    st.add(nbrs);
                }
            }

        }
        return false;
    }
}
