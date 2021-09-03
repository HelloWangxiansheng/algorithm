package com.wangwangwang.algorithm; /**
 * @author wangwangwang <wangwangwang@kuaishou.com>
 * Created on 2021-08-31
 */

/**
 * test alrorithm
 * 练习
 */

public class testTemp {

    public static void main(String[] args) {
        int n=50;//多少行
        int[][] arr =new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    arr[i][j]=1;
                    System.out.print(1);
                    continue;
                }else if(j==i){
                    arr[i][j]=1;
                    System.out.print(" "+1);
                    continue;
                }
                if(i>1&&j>=1){
                    int num=arr[i-1][j]+arr[i-1][j-1];
                    arr[i][j]=num;
                    System.out.print(" "+num);
                }
            }
            System.out.println();
        }
    }
}
