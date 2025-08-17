package Assignments_Tree.Binary_Tree;
//Create tree ( Using preorder and inorder)
//You are given two integer arrays preorder and inorder representing the preorder and inorder traversal of a binary tree, respectively. Your task is to reconstruct the binary tree and return its level order traversal.
//
//
//Input Format
//The first line contains an integer n, the number of nodes in the tree.
//The second line contains n space-separated integers representing the preorder traversal of the tree.
//The third line contains n space-separated integers representing the inorder traversal of the tree.
//
//Constraints
//1 ≤ n ≤ 105
//1 ≤ Node.val ≤ 105
//
//Output Format
//Print the level order traversal of the reconstructed binary tree in a single line, with each node value separated by a space.
//
//
//Sample Input
//7
//1 2 4 5 3 6 7
//4 2 5 1 6 3 7
//Sample Output
//1 2 3 4 5 6 7
//Explanation
//Given the following traversals:
//
//Preorder: [1, 2, 4, 5, 3, 6, 7]
//Inorder: [4, 2, 5, 1, 6, 3, 7]
//The binary tree reconstructed from these traversals is:
//
//        1
//       / \
//      2   3
//     / \ / \
//    4  5 6  7
//
//The level order traversal of this tree is: 1 2 3 4 5 6 7.
import java.util.*;
public class Create_Tree {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Create_Tree m = new Create_Tree();
        int n  = scn.nextInt();
        int[] pre = new int[n];
        for(int i = 0;i < n;i++) pre[i] = scn.nextInt();
        int[] in = new int[n];
        for(int i = 0;i <n;i++) in[i] = scn.nextInt();
        BinaryTree bt = m.new BinaryTree(pre, in);
        bt.display();
    }

    // public static int[] takeInput() {
    // 	int n = scn.nextInt();

    // 	int[] rv = new int[n];
    // 	for (int i = 0; i < rv.length; i++) {
    // 		rv[i] = scn.nextInt();
    // 	}

    // 	return rv;
    // }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree(int[] pre, int[] in) {
            this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
        }

        public void levelOrder() {
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                Node curr = q.poll();
                System.out.print(curr.data + " ");
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }

        private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {

            // write your code here

            if (plo > phi || ilo > ihi) return null;

            Node node = new Node();
            node.data = pre[plo];

            int idx = ilo;
            while (idx <= ihi && in[idx] != node.data) {
                idx++;
            }

            int leftCount = idx - ilo;

            node.left = construct(pre, plo + 1, plo + leftCount, in, ilo, idx - 1);
            node.right = construct(pre, plo + leftCount + 1, phi, in, idx + 1, ihi);

            return node;

        }

        public void display() {
            if (root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                Node curr = q.poll();
                System.out.print(curr.data + " ");
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
    }


}

