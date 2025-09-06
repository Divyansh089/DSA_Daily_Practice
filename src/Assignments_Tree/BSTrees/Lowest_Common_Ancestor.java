package Assignments_Tree.BSTrees;
//Lowest Common Ancestor of a Binary Search Tree
//Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
//
//According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
//
//
//Input Format
//Enter the number of nodes N and add N more numbers to the BST, then add the two numbers whose LCA is to be found.
//
//
//Constraints
//The number of nodes in the tree is in the range [2, 105].
//-109 <= Node.val <= 109
//All Node.val are unique.
//p != q
//p and q will exist in the BST
//
//
//Output Format
//Display the LCA value.
//
//
//Sample Input
//4
//5
//3
//2
//7
//7
//5
//Sample Output
//5
//Explanation
//None

import java.util.*;

public class Lowest_Common_Ancestor {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static Node root;

    // insert into BST
    static Node insert(Node node, int val) {
        if (node == null) return new Node(val);

        if (val < node.data) node.left = insert(node.left, val);
        else node.right = insert(node.right, val);

        return node;
    }

    // find LCA in BST
    static Node lowestCommonAncestor(Node root, int p, int q) {
        if (root == null) return null;

        if (p < root.data && q < root.data)
            return lowestCommonAncestor(root.left, p, q);

        if (p > root.data && q > root.data)
            return lowestCommonAncestor(root.right, p, q);

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of nodes
        root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int p = sc.nextInt();
        int q = sc.nextInt();

        Node lca = lowestCommonAncestor(root, p, q);
        System.out.println(lca.data);
    }
}

