package Assignments_Tree.Binary_Tree;
//Is Balanced (Binary Tree)
//Given a Binary tree check if it is balanced i.e. depth of the left and right sub-trees of every node differ by 1 or less.
//
//
//Input Format
//Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL
//
//
//Constraints
//1 <= No of nodes <= 10^5
//
//
//Output Format
//Display the Boolean result
//
//
//Sample Input
//10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
//Sample Output
//true
//Explanation
//The tree looks like
//
//             10
//          /       \
//       20           30
//    /     \       /     \
//   40      50    60      73
//The given tree is clearly balanced as depths of the left and right sub-trees of every node differ by 1 or less.
import java.util.*;
public class Is_Balanced {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Is_Balanced m = new Is_Balanced();
        BinaryTree bt = m.new BinaryTree();
        System.out.println(bt.isBalanced());
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

        public boolean isBalanced() {
            return this.isBalanced(this.root).isBalanced;
        }

        private BalancedPair isBalanced(Node node) {
            if (node == null) {
                BalancedPair bp = new BalancedPair();
                bp.height = 0;
                bp.isBalanced = true;
                return bp;
            }

            BalancedPair left = isBalanced(node.left);
            BalancedPair right = isBalanced(node.right);

            BalancedPair curr = new BalancedPair();
            curr.height = Math.max(left.height, right.height) + 1;

            // a node is balanced if:
            // 1. left subtree is balanced
            // 2. right subtree is balanced
            // 3. difference in height ≤ 1
            curr.isBalanced = left.isBalanced && right.isBalanced &&
                    (Math.abs(left.height - right.height) <= 1);

            return curr;
        }


        private class BalancedPair {
            int height;
            boolean isBalanced;
        }

    }
}

