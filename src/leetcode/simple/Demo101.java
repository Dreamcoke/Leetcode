package leetcode.simple;

/**
 * Definition for a binary tree node.
 */
class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1(int x) { val = x; }
  }

class Demo101 {
    int i=0;
    int[] k=new int[50];
    public boolean isSymmetric1(TreeNode1 root1, TreeNode1 root2) {
        if(root1==null&root2==null)
            return true;
        if(root1!=null&root2==null)
            return false;
        if(root1==null&root2!=null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return isSymmetric1(root1.left,root2.right)&isSymmetric1(root1.right,root2.left);
    }
    public boolean isSymmetric(TreeNode1 root){
        return isSymmetric1(root,root);

    }
}
