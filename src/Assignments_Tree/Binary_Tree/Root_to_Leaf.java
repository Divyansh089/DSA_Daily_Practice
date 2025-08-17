package Assignments_Tree.Binary_Tree;
//Given a binary tree and a number k, print out all root to leaf paths where the sum of all nodes value is same as the given number.
//
//
//Input Format
//First line contains the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL. Second line contains the number k.
//
//
//Constraints
//None
//
//
//Output Format
//Display the root to leaf path whose sum is equal to k.
//
//
//Sample Input
//10 true 20 true 30 false false true 50 false false true 40 true 60 false false true 73 false false
//60
//Sample Output
//10 20 30
//Explanation
//The given tree is in pre order traversal. So convert it into binary tree and check root to leaf path sum.
import java.util.*;
public class Root_to_Leaf {
    Scanner scn = new Scanner(System.in);
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;
    int size;

    public Root_to_Leaf(int rootData, Root_to_Leaf leftST, Root_to_Leaf rightST) {   // changed BinaryTree -> Main
        this.root = new Node(rootData, null, null);
        this.root.left = leftST != null ? leftST.root : null;
        this.root.right = rightST != null ? rightST.root : null;

        this.size += leftST != null ? leftST.size : 0;
        this.size += rightST != null ? rightST.size : 0;
        this.size += 1;
    }

    public Root_to_Leaf() {
        this.root = this.takeInput(scn, null, false);
    }

    private Node takeInput(Scanner scn, Node parent, boolean isLeft) {
        int cData = scn.nextInt();
        Node child = new Node(cData, null, null);
        this.size++;

        boolean choice = scn.nextBoolean();
        if (choice) {
            child.left = this.takeInput(scn, child, true);
        }

        choice = scn.nextBoolean();
        if (choice) {
            child.right = this.takeInput(scn, child, false);
        }

        return child;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.toString(this.root);
    }

    private String toString(Node node) {
        if (node == null) {
            return "";
        }

        String retVal = "";

        if (node.left != null) {
            retVal += node.left.data + " => ";
        } else {
            retVal += "END" + " => ";
        }

        retVal += node.data;

        if (node.right != null) {
            retVal += " <= " + node.right.data;
        } else {
            retVal += " <= " + "END";
        }

        retVal += "\n";

        retVal += this.toString(node.left);
        retVal += this.toString(node.right);

        return retVal;
    }

    public void rootToLeaf(int k){
        this.rootToLeaf(this.root, "", 0, k);
    }

    private void rootToLeaf(Node node, String path, int sum, int k){
        if(node == null){
            return;
        }

        sum += node.data;
        path += node.data + " ";

        if(node.left == null && node.right == null){
            if(sum == k){
                System.out.println(path);
            }
            return;
        }

        rootToLeaf(node.left, path, sum, k);
        rootToLeaf(node.right, path, sum, k);
    }

    public static void main(String[] args) {
        Root_to_Leaf b1 = new Root_to_Leaf();     // builds tree from input
        int k = b1.scn.nextInt(); // safely read k after tree input
        b1.rootToLeaf(k);
    }
}

