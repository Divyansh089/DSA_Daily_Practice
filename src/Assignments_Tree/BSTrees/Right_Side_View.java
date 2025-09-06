package Assignments_Tree.BSTrees;
//Given a binary tree, Print its right side view ordered from top to bottom.
//Right Side view is defined as nodes that are visible from right side of the tree ie. to a person standing to the right of the tree,only these nodes are visible.
//
//
//Input Format
//The first line contains level order traversal of the tree.In the level order traversal , a -1 represent a null child while any other value represent a node in the tree.
//
//
//Constraints
//1<=number of nodes in the tree <=10^5
//
//
//Output Format
//Print the Right Side View as space separated integer ordered from top to bottom.
//
//
//Sample Input
//1 2 3 -1 -1 -1 -1
//Sample Output
//1 3
//Explanation
//To a person standing to the right,only nodes with value 1 and 3 are visible.
import java.util.*;
import java.io.*;

public class Right_Side_View {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        Trees bt = new Trees(arr);

        bt.rightView();
    }
}

class Trees {
    private class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    Trees(String[] arr) {
        if (arr.length == 0) return;
        Queue<Node> queue = new LinkedList<>();
        this.root = createNode(arr[0]);
        if (this.root != null) queue.add(this.root);

        int i = 1;
        while (i < arr.length) {
            Node parent = queue.poll();
            if (parent != null) {
                // left child
                if (i < arr.length) {
                    parent.left = createNode(arr[i++]);
                    if (parent.left != null) queue.add(parent.left);
                }
                // right child
                if (i < arr.length) {
                    parent.right = createNode(arr[i++]);
                    if (parent.right != null) queue.add(parent.right);
                }
            }
        }
    }

    // helper to skip -1 as null
    private Node createNode(String val) {
        int num = Integer.parseInt(val);
        if (num == -1) return null;
        return new Node(num);
    }

    public void rightView() {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        ArrayList<Integer> res = new ArrayList<>();

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                if (i == size - 1) {
                    res.add(curr.data); // only last node in level
                }

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }

        // print clean output
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
            if (i != res.size() - 1) System.out.print(" ");
        }
    }
}
