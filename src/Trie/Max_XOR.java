package Trie;

public class Max_XOR {
    public static void main(String args[]){
        int[] arr = {3 , 10 , 5, 25 ,2 , 8};
    }

    static class Trie{
        class Node{
            Node zero;
            Node one;
        }

        private Node root = new Node();
        public void add(int val){
            Node curr = root;
            for(int i =31;i>=0;i--){
                int bit = val & (1 << i);
                if(bit ==0){
                    if(curr.zero != null){
                        curr =curr.zero;
                    }else{
                        Node nn = new Node();
                        curr.zero = nn;
                        curr = nn;
                    }
                }else{
                    if(curr.one != null){
                        curr =curr.zero;
                    }else{
                        Node nn = new Node();
                        curr.one = nn;
                        curr = nn;
                    }

                }
            }
        }
    }
}
