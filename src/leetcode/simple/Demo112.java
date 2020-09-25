package leetcode.simple;

import java.util.LinkedList;
import java.util.Queue;

public class Demo112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        return isTrue(root,sum,0);
    }

    public boolean isTrue(TreeNode root, int sum, int n){
        if(root==null)
            return false;
        n=n+root.val;
        if(n==sum&&root.left==null&&root.right==null)
            return true;
        if(isTrue(root.left,sum,n))
            return true;
        return isTrue(root.right,sum,n);
    }

    public boolean hasPathSum1(TreeNode root, int sum){
        if(root==null)
            return false;
        Queue<TreeNode> queNode=new LinkedList<TreeNode>();
        Queue<Integer> quesum=new LinkedList<Integer>();
        queNode.offer(root);
        quesum.offer(root.val);
        while(!queNode.isEmpty()){
            TreeNode cur=queNode.poll();
            int temp=quesum.poll();
            if(cur.left==null&&cur.right==null)
            {
                if(temp==sum)
                    return true;
                continue;
            }

            if(cur.left!=null){
                queNode.offer(cur.left);
                quesum.offer(temp+cur.left.val);
            }

            if(cur.right!=null){
                queNode.offer(cur.right);
                quesum.offer(cur.right.val+temp);
            }

        }
        return false;
    }
}
