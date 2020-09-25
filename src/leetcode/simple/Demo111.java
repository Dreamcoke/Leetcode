package leetcode.simple;

import java.util.LinkedList;
import java.util.Queue;

public class Demo111 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  public class QueueNode{
        TreeNode node;
        int dep;

        public QueueNode(TreeNode node,int dep){
            this.node=node;
            this.dep=dep;
        }
  }
  int l,r;
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        int l=minDepth(root.left);
        int r=minDepth(root.right);
        if(l==0||r==0)
            return r+l+1;
        return (l<r? l:r)+1;

    }

    public int Depth(TreeNode root){
        if(root==null)
            return 0;
        Queue<QueueNode> queue=new LinkedList<QueueNode>();
        queue.offer(new QueueNode(root,1));
        while(!queue.isEmpty()){
            QueueNode tempnode=queue.poll();
            int tempdep=tempnode.dep;
            TreeNode node=tempnode.node;
            if(node.left==null&&node.right==null)
                return tempdep;
            if(node.left!=null){
                queue.offer(new QueueNode(node.left,tempdep+1));
            }
            if(node.right!=null){
                queue.offer(new QueueNode(node.right,tempdep+1));
            }
        }
        return 0;
    }
}
