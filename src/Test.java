import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wangwangwang <wangwangwang@kuaishou.com>
 * Created on 2021-09-03
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr =new int[size];
        String[] arrs = new String[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
            arrs[i]=in.next();
        }
        for(int i=0;i<size;i++){
            String target = arrs[i];
            int cout=0;
            for(int j=0;j<arr[i];j++){
                if("(".equals(""+target.charAt(j))){
                    cout++;
                }
            }

            System.out.println(cout);
//            arrs[i]
        }
//        int k =in.nextInt();
//        int l=in.nextInt();
//        List<Integer> list =new ArrayList<>();
//        for(int i=0;i<size;i++){
//            int n=in.nextInt();
//            list.add(n);
//        }
//        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
//        int index = 0;
//        for(int i=0;i<size;i++){
//            if(collect.get(i)<=l){
//                index++;
//            }else {
//                break;
//            }
//        }
////        int flag =0;
////        if(collect.size()>2&&collect.get(0)+collect.get(1)<collect.get(size-2)){
////            flag=1;
////        }
//        int num=0;
//        for(int i=1;i<=size;i++){
//
//                if (index>0) {
//                    num+=collect.get(--index);
//
//                }else {
//                    --size;
//                    num+=collect.get(size);
//                    if(collect.get(size)>l){
//                        i+=k;
//                    }
//                }
//        }
//
//
//        System.out.println(num);

        //        for(int i=0;i<size;i++){
//            System.out.println(getResultNum(arr[i]));
//        }
    }

    private static int getResultNum(int n) {
        if(n%2==0){
            return n/2;
        }else {
            return (n+1)/2;
        }


    }


}
