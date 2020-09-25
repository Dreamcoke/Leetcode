package leetcode.simple;

public class Demo226 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode invertTree(TreeNode root) {
        if (root==null)
            return null;
        TreeNode left=invertTree(root.right);
        TreeNode right=invertTree(root.left);
        root.right=left;
        root.left=right;
        return root;
    }
}
