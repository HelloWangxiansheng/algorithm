/**
 * @author wangwangwang <wangwangwang@kuaishou.com>
 * Created on 2021-08-19
 */
public class LookupAlgorithm {

    /**
     * 字节跳动面试 算法
     * 剑指offer  JZ1
     * @param args
     */


    public static void main(String[] args) {
        //变种二分法 ,使用二分法来获取元素的索引位置
        //        int[] arr ={1,2,3,3,4,5,5,5,5,5,5,5,6,6,8,8,8,8,8,9};
        //        int targe=10;
        //        int index = getIndex(arr,targe,0,arr.length-1,0);//左
        //        int index1 = getIndex(arr,targe,0,arr.length-1,1);//右
        //        System.out.println(index+" "+index1);

        //剑指offer
        //JZ1 二维数组中的查找
        //        int target =11;
        //        int [][] arr ={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        //        boolean b =isInMetrix(target,arr);
        //        System.out.println(b);
    }


    public static int getIndex(int[] nums, int target,int l,int h,int lf) {
        int index=0;
        while(l<h){

            int mid = (l+h)/2;
            if(target>nums[mid]){
                if(l==mid){
                    if(index==1){
                        return h;
                    }else {
                        return -1;
                    }
                }
                l=mid;
            }else if(target<nums[mid]){
                if(l==mid){
                    if(index==1){
                        return l;
                    }else {
                        return -1;
                    }
                }
                h=mid;
            }else if(target==nums[mid]){
                if(lf==0){
                    h=mid-1;
                    index =1;
                    if(nums[h]!=nums[mid]){
                        return mid;
                    }
                }else {
                    l=mid+1;
                    index =1;
                    if(nums[l]!=nums[mid]){
                        return mid;
                    }
                }
            }
        }
        return -1;
    }


    private static boolean isInMetrix(int target, int[][] arr) {
        int h=arr.length;
        int w =arr[0].length;
        if(target>=arr[0][0]&&target<=arr[h-1][w-1]){
            int c =w-1;
            int r=0;
            while (r<=h&&c>=0){
                if(target>arr[r][c]){
                    r++;
                }else if(target<arr[r][c]){
                    c--;
                }else {
                    return true;
                }
            }
        }else {
            return false;
        }
        return false;
    }
}
