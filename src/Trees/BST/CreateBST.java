package Trees.BST;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;


        }
    }
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left , val);
        }else{
            root.right = insert(root.right , val);
        }
        return root;
    }
    public static boolean search(Node root , int val){
        if(root == null){
            return false;
        }
        if(root.data > val){
            return search(root.left , val);
        }else if(root.data == val){
            return true;
        }else{
            return search(root.right , val);
        }


    }
    public static Node delete(Node root  , int val){
        if(root.data > val){
            root.left = delete(root.left , val);
        }else if(root.data < val){
            root.right = delete(root.right , val);
        }else{
            if(root.left  == null && root.right == null){ // for no child
                return null;
            }

            if(root.left == null){
                return root.right;
            }                           // for one child
            if(root.right == null){
                return root.left;
            }

            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;           // for two children
            root.right = delete(root.right , IS.data);

        }
        return root;

    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void printInRange(Node root , int  x, int y){
        if(root == null) return;
        if(root.data >=x && root.data <= y){
            printInRange(root.left , x , y);
            System.out.println(root.data + " ");
            printInRange(root.right , x, y);
        }else if(root.data <= y){
            printInRange(root.left  , x, y);
        }else{
            printInRange(root.right , x, y);
        }

    }

    public static void paths(Node root , ArrayList<Integer> ans){
        if(root == null) return;
        ans.add(root.data);
        if(root.left == null && root.right == null){
            printPath(ans);
        }else{
            paths(root.left , ans);
            paths(root.right , ans);
        }
        ans.remove(ans.size() - 1);
    }
    public static void printPath(ArrayList<Integer> ans){
        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + "->");
        }
        System.out.println();
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String args[]){
        int []values = { 5 , 1 , 3, 4, 2, 7};
        Node root = null;
        for(int i = 0;i< values.length;i++){
            root = insert(root , values[i]);
        }
//        inorder(root);
//        System.out.println(search(root , 3));
//        delete(root , 5);
//        inorder(root);
        printInRange(root , 2, 7);
        paths(root , new ArrayList<>());
    }
}
