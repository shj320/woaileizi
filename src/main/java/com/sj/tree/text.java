/**
 * author:sj
 */

package com.sj.tree;

import java.util.ArrayList;
import java.util.List;

public class text {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode = new TreeNode(3,treeNode1,treeNode2);
        text text = new text();
        int i = text.kthSmallest(treeNode, 1);
        System.out.println(i);

    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=  new ArrayList();
        List<Integer> list1=helper(root,list);
        return list1.get(k-1);
    }
    public List<Integer> helper(TreeNode root,List<Integer> list){

        if(root==null){
            return null ;
        }
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
        return list;
    }
}
