package com.wangwangwang.algorithm;

import java.util.Scanner;

/**
 * @author wangwangwang <wangwangwang@kuaishou.com>
 * Created on 2021-08-19
 */
public class InterviewsAlgorithm {

    /**
     * 面试笔试遇到的算法真题
     * @param args
     */

    private static int allNums=0;
    public static void main(String[] args) {
        //shoppee
        /**
         * 输入一个整数，转换成16进制，并判断是否为回文数，不是返回0，是返回1
         */
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        Integer2Hex(i);

        //字节跳动 来自jinxin的面试反馈
        /**
         * 有0 1 2 3 4 5 6 7 8 9 十个数字，构成一个环，9在0的旁边
         * 先有个人在0这个位置出发，走出n步后回到原点的走法有多少种？ 只能一步一步走
         * n=16
         */

        getNumbersWalker(0,0,16);

        System.out.println(allNums*2);//*2是因为当前的方法只考虑了向右，没考虑向左

    }

    /**
     *
     * @param nowIndex 当前索引位置
     * @param walk_step 已步行的步数
     * @param step 总共可以走的步数
     * @return
     */
    private static void getNumbersWalker(int nowIndex, int walk_step, int step) {
        if(walk_step==step&&nowIndex==0){
            allNums++;
            return;
        }
        if(walk_step==step){
            return;
        }
        getNumbersWalker(nowIndex+1,walk_step+1,step);
        getNumbersWalker((nowIndex-1+10)%10,walk_step+1,step);

    }

    //输入一个整数，转换成16进制，并判断是否为回文数，不是返回0，是返回1
    private static void Integer2Hex(int i) {
        int num=i;
        if (num == 0) {
            System.out.println(0);
            return;
        }
        char[] chs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] arr = new char[8];
        int pos = arr.length;
        while (num != 0) {
            int temp = num & 15;
            arr[--pos] = chs[temp];
            num = num >>> 4;
        }
        String result = "";
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                result += arr[j];
            }

        }
        String s = result;
        int low = 0;
        int hight = s.length() - 1;
        while (low < hight) {
            if (s.charAt(low) != s.charAt(hight)) {
                System.out.println(0);
            } else {
                low++;
                hight--;
            }
        }
        System.out.println(1);
    }
}
