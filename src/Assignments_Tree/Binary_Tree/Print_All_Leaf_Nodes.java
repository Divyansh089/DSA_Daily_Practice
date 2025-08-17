package Assignments_Tree.Binary_Tree;
//Given a Binary Tree Print all the leaf nodes.
//
//
//Input Format
//Level order input of the binary tree
//
//
//Constraints
//Total no of nodes <1000
//
//
//Output Format
//All leaf nodes from left to right in single line
//
//
//Sample Input
//1
//2 3
//4 5
//6 7
//-1 -1
//-1 -1
//-1 -1
//-1 -1
//Sample Output
//4 5 6 7
import java.util.*;

//class TreeNode {
//    int val;
//    TreeNode left, right;
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//}

public class Print_All_Leaf_Nodes {
    public static TreeNode buildTree(List<Integer> values) {
        if (values.isEmpty() || values.get(0) == -1)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(values.get(0));
        queue.add(root);
        int index = 1;

        while (!queue.isEmpty() && index < values.size()) {
            TreeNode node = queue.poll();

            if (index < values.size() && values.get(index) != -1) {
                node.left = new TreeNode(values.get(index));
                queue.add(node.left);
            }
            index++;

            if (index < values.size() && values.get(index) != -1) {
                node.right = new TreeNode(values.get(index));
                queue.add(node.right);
            }
            index++;
        }
        return root;
    }

    public static void printLeaves(TreeNode node) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            System.out.print(node.val + " ");
            return;
        }
        printLeaves(node.left);
        printLeaves(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        while (sc.hasNextInt()) {
            values.add(sc.nextInt());
        }
        TreeNode root = buildTree(values);
        printLeaves(root);
        sc.close();
    }
}

