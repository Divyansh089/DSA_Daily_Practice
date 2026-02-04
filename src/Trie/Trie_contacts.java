package Trie;



import java.util.*;

public class Trie_contacts {
    class Node{
        char ch;
        boolean isterminal;
        HashMap<Character,Node> child;
        int count = 1;
        public Node (char ch){
            this.ch = ch;
            child = new HashMap<>();
        }
    }
    private Node root;
    private Trie_contacts(){
        root = new Node('*');
    }
    public void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
                curr.count++;
            }else {
                Node nn = new Node(ch);
                curr.child.put(ch,nn);
                curr = nn;
            }
        }
        curr.isterminal = true;
    }
    public boolean search(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }else {
                return false;
            }
        }
        return curr.isterminal;
    }
    public int startsWith(String prefix){
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }else {
                return 0;
            }
        }
        return curr.count;
    }
}