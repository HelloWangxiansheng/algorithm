package com.wangwangwang.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wangwangwang <wangwangwang@kuaishou.com>
 * Created on 2021-07-19
 */
class RecursiveAlgorithm {
    /**
     * 剑指offer JZ27 字符串的排列
     * JZ4 重建二叉树
     * @param args
     */


    public static void main(String[] args) {


        //字符串元素排列组合
//        String string ="zxcvb";
//        List<String> result = getPermutation(new StringBuffer(string));
//        System.out.println(result.size());



        //JZ4 重建二叉树
//        Integer[] first = {1, 2, 4, 7, 3, 5, 6, 8};
//        Integer[] mid = {4, 7, 2, 1, 5, 3, 8, 6};
//        int rootValue =first[0];
//        TreeNode root = new TreeNode(rootValue);
//        rebuildBTree(first,mid,root);
//        System.out.println(root.val);


    }
    //根据先序和中序，重构二叉树
    private static void rebuildBTree(Integer[] first, Integer[] mid,TreeNode root) {

        if(first.length==1||mid.length==1||first==null||mid==null){
            return ;
        }

        Integer firstValue =first[0];

        List<Integer> firstList = Stream.of(first).collect(Collectors.toList());

        List<Integer> integers = Arrays.asList(mid);
        int index = integers.indexOf(firstValue);

        //index即是左子树元素长度 新的先序数组
        Integer[] objects = (Integer[]) firstList.subList(1, 1 + index).toArray(new Integer[index]);

        Integer[] integers1 = (Integer[]) integers.subList(0, index).toArray(new Integer[index]);
        if(integers1.length>0){
            root.left=new TreeNode(objects[0]);
            rebuildBTree(objects,integers1,root.left);//左子树
        }


        //右子树
        List<Integer> integers2 = firstList.subList(1 + index, firstList.size());

        List<Integer> integers3 = integers.subList(1 + index, integers.size());

        if(integers2.size()>0){
            root.right=new TreeNode(integers2.get(0));
            rebuildBTree(integers2.toArray(new Integer[integers2.size()]),integers3.toArray(new Integer[integers3.size()]),root.right);
        }




    }

    //node 节点类
    static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     public TreeNode(int value){
         this.val=value;
     }
  }


    //字符串 字符的所有排列组合 需要去重一下
    private static List<String> getPermutation(StringBuffer string) {
        List<String> list  =new ArrayList();
        if(string.length()==1){
            list.add(string.toString());
            return list;
        }else {
            for(int i=0;i<string.length();i++){
                char temp = string.charAt(i);
                string.setCharAt(i,string.charAt(0));
                string.setCharAt(0,temp);
                List<String> permutation = getPermutation(new StringBuffer(string.substring(1)));
                for(String ss :permutation){
                    list.add(string.charAt(0)+ss);
                }
                string.setCharAt(0,string.charAt(i));
                string.setCharAt(i,temp);
            }
            return list;
        }

    }
}