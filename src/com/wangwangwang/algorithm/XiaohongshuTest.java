package com.wangwangwang.algorithm;

import java.util.Map;
import java.util.Scanner;

/**
 * @author wangwangwang <wangwangwang@kuaishou.com>
 * Created on 2021-09-04
 */
public class XiaohongshuTest {

    public static void main(String[] args) {
        //        1 2 -3
        //        3 4 -5
        //        -5 -6 -7

        Scanner sc =new Scanner(System.in);
        int col = sc.nextInt();
//        String ssc ="";
//        while (sc.hasNextInt()){
//            ssc=" "+sc.nextInt();
//        }
        String  ssc =sc.next();
        String line = ssc+sc.nextLine();
        String[] s = line.split(" ");
        int row = s.length/col;
        int [][] arr =new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=1;j<=col;j++){
                arr[i][j-1]=Integer.parseInt(s[col*i+j-1]);
            }
        }
//        [][][]
//        [][][]
//        [][][]
        int max =-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col-i;j++){
                int result = getResult(i,j,arr,row,col);
                max =Math.max(result,max);

            }
        }
        System.out.println(max);
    }

    private static int getResult(int i, int j, int[][] arr, int row, int col) {
        int re = 0;
        for(int k=0;k<row-i;k++){
            for(int l=0;l<col-j;l++){
                re = Math.max(getArr(i,k,j,l,arr),re);
//                re+=arr[k][l];
            }
        }
        return re;
    }

    private static int getArr(int i, int k, int j, int l,int [][] aa) {
        int rer =0;
        for(int b =i;b<=i+k;b++){
            for(int c=j;c<=j+l;c++){
                rer+=aa[b][c];
            }
        }
        return rer;

    }


}
