package Assignments_Tree.BST;
//Given a binary search tree, replace each nodes' data with the sum of all nodes' which are greater or equal than it. Include the current node's data also.
//
//
//Input Format
//The first line contains a number n showing the length of the inorder array of BST. The next line contains n integers denoting the elements of the array.
//
//
//Constraints
//2 ≤ N ≤ 10^3
//
//
//Output Format
//Print the preorder traversal of the new tree.
//
//
//Sample Input
//7
//20
//30
//40
//50
//60
//70
//80
//Sample Output
//260 330 350 300 150 210 80
//Explanation
//The original tree looks like
//
//            50
//        /        \
//      30          70
//    /    \       /   \
//  20    40      60    80
//We are supposed to replace the elements by the sum of elements larger than it.
//80 being the largest element remains unaffected .
//70 being the second largest element gets updated to 150 (70+80)
//60 becomes 210 (60 + 70 + 80)
//50 becomes 260 (50 + 60 + 70 + 80)
//40 becomes 300 (40 + 50 + 60 + 70 + 80)
//30 becomes 330 (30 + 40 + 50 + 60 + 70 + 80)
//20 becomes 350 (20 + 30 + 40 + 50 + 60 + 70 + 80)
//
//The new tree looks like
//
//           260
//        /        \
//     330         150
//    /    \       /   \
//  350    300   210    80
//The Pre-Order traversal (Root->Left->Right) looks like :
//260 330 350 300 150 210 80.
import java.util.*;

class Replace_with_Sum_of_greater_nodes {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Build BST from sorted inorder array
    static Node buildBST(int[] in, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Node root = new Node(in[mid]);
        root.left = buildBST(in, start, mid - 1);
        root.right = buildBST(in, mid + 1, end);
        return root;
    }

    // Running sum
    static int sum = 0;

    // Replace node values with sum of greater-or-equal values
    static void replaceWithSum(Node root) {
        if (root == null) return;

        // Right → Root → Left
        replaceWithSum(root.right);
        sum += root.data;
        root.data = sum;
        replaceWithSum(root.left);
    }

    // Preorder traversal
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inorder = new int[n];
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }

        Node root = buildBST(inorder, 0, n - 1);

        replaceWithSum(root);

        preorder(root);
    }
}

