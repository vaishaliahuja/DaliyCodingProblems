/* A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
*/



public class Main {
    
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int v){val = v;}
    }
    private int count = 0;
    public int countUnivalSubTrees(TreeNode root){
        count = 0;
        isUniVal(root);
        return count;
    }
    private boolean isUniVal(TreeNode root){
        if(root==null)return true;
        
        boolean leftUniVal = isUniVal(root.left);
        boolean rightUniVal = isUniVal(root.right);
        
        if(!leftUniVal || !rightUniVal)return false;
        
        if(root.left!=null && root.left.val!=root.val) return false;
        if(root.right!=null && root.right.val!=root.val)return false;
        
        count++;
        return true;
    }
    
    public static void main(String[] args) {
        
        TreeNode node = new TreeNode(0);
        node.right = new TreeNode(0);
        node.left = new TreeNode(1);
        node. right.left = new TreeNode(1);
        node .right.right = new TreeNode(0);
        node.right.left.left = new TreeNode(1);
        Main m = new Main();
        int count = m.countUnivalSubTrees(node);
        System. out.println("No. of UniVal tree === " + count);
        
    }
}
