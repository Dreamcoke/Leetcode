package leetcode.simple;

import java.util.ArrayList;
import java.util.List;

public class Demo257 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void  create_path(TreeNode root,String path,List<String> paths){
        if (root!=null)
        {
            path+=Integer.toString(root.val);
            if (root.right==null&&root.left==null){
                paths.add(path);
            }
            else{
                path+="->";
                create_path(root.left,path,paths);
                create_path(root.right,path,paths);

            }
        }

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        create_path(root,"",list);
        return list;
    }


}
