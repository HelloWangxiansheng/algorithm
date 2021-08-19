import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wangwangwang <wangwangwang@kuaishou.com>
 * Created on 2021-07-19
 */
class Demo1 {
//    public static void main(String[] args) {
//
//        if(!true&&false){
//            System.out.println(11);
//        }

//        List<String> list = null;
//        for (String s:list){
//            System.out.println(s);
//        }

//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        String s = scanner.nextLine();
//        String s1 = scanner.nextLine();


        //        // String s = integer2Hex(i);
//        // int b = isT(s);
//        int num=i;
//        if (num == 0) {
//            System.out.println(0);;
//        }
//        char[] chs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
//        char[] arr = new char[8];
//        int pos = arr.length;
//        while (num != 0) {
//            int temp = num & 15;
//            arr[--pos] = chs[temp];
//            num = num >>> 4;
//        }
//        String result = "";
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] != 0) {
//                result += arr[j];
//            }
//
//        }
//        String s = result;
//        int low = 0;
//        int hight = s.length() - 1;
//        while (low < hight) {
//            if (s.charAt(low) != s.charAt(hight)) {
//                System.out.println(0);
//            } else {
//                low++;
//                hight--;
//            }
//        }
//
//
//        System.out.println(1);
//    }


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

                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
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

    public static void main(String[] args) {
        //变种二分法
        //        int[] arr ={1,2,3,3,4,5,5,5,5,5,5,5,6,6,8,8,8,8,8,9};
        //        int targe=10;
        //        int index = getIndex(arr,targe,0,arr.length-1,0);//左
        //        int index1 = getIndex(arr,targe,0,arr.length-1,1);//右
        //        System.out.println(index+" "+index1);

        //字符串元素排列组合
        //        String string ="zxcvb";
        //        List<String> result = getPermutation(new StringBuffer(string));
        //        System.out.println(result.size());

        //JZ1 二维数组中的查找
        //        int target =11;
        //        int [][] arr ={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        //        boolean b =isInMetrix(target,arr);
        //        System.out.println(b);

        //JZ4 重建二叉树
//        Integer[] first = {1, 2, 4, 7, 3, 5, 6, 8};
//        Integer[] mid = {4, 7, 2, 1, 5, 3, 8, 6};
//        int rootValue =first[0];
//        TreeNode root = new TreeNode(rootValue);
//        rebuildBTree(first,mid,root);
//        System.out.println(root.val);

        
    }

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




    private static boolean isInMetrix(int target, int[][] arr) {
        int h=arr.length;
        int w =arr[0].length;
        if(target>=arr[0][0]&&target<=arr[h-1][w-1]){
//            int val =arr[0][w-1];
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