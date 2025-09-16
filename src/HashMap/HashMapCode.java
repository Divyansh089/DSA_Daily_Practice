package HashMap;
import java.util.*;
public class HashMapCode {
    static class HashMap<k ,v>{
        private class Node{
            k key;
            v value;

            public Node(k key , v value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;// nodes of LL
        private int N; // size of the array
        private LinkedList<Node> buckets[];

        //@SuppressWarnings("unchecked");

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(k key){
            return Math.abs(key.hashCode()) % N;
        }
        private int searchInLL(k key , int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i = 0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i; // di
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> old []= buckets;
            buckets = new LinkedList[N*2];
            for(int i = 0; i<N*2;i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i = 0;i<old.length;i++){
                LinkedList<Node> ll = old[i];
                for(int j = 0;j<ll.size();j++){
                    Node node  = ll.get(j);
                    put(node.key , node.value);

                }
            }
        }
        public void put(k key , v value){
            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di == -1){ // key doesn't exist
                buckets[bi].add(new Node(key , value));
            }else{ // key exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){ // rehashing
                rehash();
            }
        }

        public boolean containsKey(k key){
            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di == -1){ // key doesn't exist
                return false;
            }else{ // key exists

                return true;
            }
        }

        public v remove (k key){

            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di == -1){ // key doesn't exist
                return null;
            }else{ // key exists
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public v get(k key){
            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di == -1){ // key doesn't exist
                return null;
            }else{ // key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<k> keySet(){

            ArrayList<k> keys = new ArrayList<>();

            for(int i = 0; i< buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(int j =0;j<ll.size();j++){
                    Node node  = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){

            return n == 0;
        }

    }
    public static void main(String args[]){
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India" , 150);
        map.put("China" , 140);
        map.put("USA" , 100);
        map.put("Nepal" , 15);

        System.out.println(map.get("China"));

        map.remove("Nepal");
        for(String keys: map.keySet()){
            System.out.println(keys);
        }
        System.out.println(map.containsKey("Nepal"));
    }
}
