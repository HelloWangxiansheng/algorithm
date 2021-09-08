import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangwangwang <wangwangwang@kuaishou.com>
 * Created on 2021-09-07
 */
public class BossTest {
    public static void main(String[] args) {

        /**
         *  2n*i-2i=2i(n-1)
         *         2i(n-1)+n,(2i+1)(n-1)+n-i
         *         (2i+1)(n-1)
         */
//        String ss = "WDCFTHNJI";
//        int n=3;
//
//        int line = ss.length()/(2*n-2);
//        int mode=ss.length()%(2*n-2);
//        if(mode>0){
//            line=line+1;
//        }
//        StringBuilder sb =new StringBuilder("");
//
//            for(int i=0;i<n;i++){
//                for(int k=0;k<line;k++){
//                if(i==0){
//                    sb.append(ss.charAt(2*k*(n-1)));
//                }else if(i==n-1){
//                    if((2*k+1)*(n-1)<ss.length()){
//                        sb.append(ss.charAt((2*k+1)*(n-1)));
//                    }
//
//                }else {
//                    if(2*k*(n-1)+i<ss.length()){
//                        sb.append(ss.charAt(2*k*(n-1)+i));
//
//                    }
//                    if((2*k+1)*(n-1)+n-1-i<ss.length()){
//                        sb.append(ss.charAt((2*k+1)*(n-1)+n-1-i));
//
//                    }
//                }
//            }
//        }
//        String s = sb.toString();
//        System.out.println(s);
        int [][] arr=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=i+j;
            }
        }
//        Arrays.stream([1,2,3],[3,4,5],[6,7,8]);
//        int []results =new int[arr.length*arr.length];
        List<Integer> list =new ArrayList<>();
        int [] result =getArr(arr,list);


    }

    private static int[] getArr(int[][] arr,List<Integer> list) {
        for(int i=0;i<arr[0].length;i++){
            list.add(arr[0][i]);
        }
        if(arr.length-1==0){

        }else {
            int [][] arrr=new int[arr[0].length][arr.length-1];
            for(int i=0;i<arr[0].length;i++){
                for(int j=0;j<arr.length-1;j++){
                    arrr[i][j]=arr[i][j];
                }
            }
            getArr(arr,list);
        }
        return null;

    }
}
