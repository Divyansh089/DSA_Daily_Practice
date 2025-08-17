package Assignments_Tree.Binary_Tree;
//Level Order ( Zigzag , Binary Tree)
//Given a binary tree. Print the zig zag order i.e print level 1 from left to right, level 2 from right to left and so on. This means odd levels should get printed from left to right and even levels should be printed from right to left.
//
//
//Input Format
//Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL
//
//
//Constraints
//None
//
//
//Output Format
//Display the values in zigzag level order in which each value is separated by a space
//
//
//Sample Input
//10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
//Sample Output
//10 30 20 40 50 60 73
import java.util.*;
public class Level_Order {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Level_Order m = new Level_Order();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderZZ();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public void levelOrderZZ() {
            if (root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            boolean leftToRight = true;

            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> level = new ArrayList<>();

                // process one level
                for (int i = 0; i < size; i++) {
                    Node curr = q.poll();
                    level.add(curr.data);

                    if (curr.left != null) q.add(curr.left);
                    if (curr.right != null) q.add(curr.right);
                }

                // print depending on direction
                if (leftToRight) {
                    for (int val : level) {
                        System.out.print(val + " ");
                    }
                } else {
                    for (int i = level.size() - 1; i >= 0; i--) {
                        System.out.print(level.get(i) + " ");
                    }
                }

                // flip direction
                leftToRight = !leftToRight;
            }
        }


    }

}

