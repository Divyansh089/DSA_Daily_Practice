package Trees;

public class BSTree {
    class Node{
        int val;
        Node left;
        Node right;

    }

    private Node root;
    public BSTree(int []in){
        root = Create_Tree(in , 0 , in.length - 1);
    }
    private Node Create_Tree(int [] in , int si , int ei){
        if(si > ei){
            return null;
        }
        int mid = (si + ei)/2;
        Node nn  = new Node();
        nn.val  = in[mid];
        nn.left = Create_Tree(in, si , mid -1);
        nn.right = Create_Tree(in, mid+ 1 , ei);
        return nn;
    }
}
