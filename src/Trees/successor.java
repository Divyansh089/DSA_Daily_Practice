package Trees;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val = x;
    }
}

public class successor {
    TreeNode successorNode = null;

    public TreeNode inorderSuccessor(TreeNode root , TreeNode p){
        return successor(root , p);
    }
    public TreeNode successor(TreeNode root, TreeNode p){
        if(root == null){
            return null;
        }
        if(root.val > p.val){
            successorNode = root;
            successor(root , p);
        }else{
            successor(root.right ,p);
        }
        return successorNode;
    }
}
// infix and postfix stack notation question will comme in the exam