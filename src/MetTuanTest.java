import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class MetTuanTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int len = sc.nextInt();
//        int [][] arr = new int [len][len];
//        for(int i=0;i<len;i++){
//            for(int j=0;j<len;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        System.out.println(len/2);

//          1 1 1
//        1 0 1 0 1
//        1 1 0 0 0 1
//        1 0 0 0 1 1
//          1 0 1 0 1
//            1 1 1
//        String next = sc.next();
//        int num=0;
//        StringBuffer sb =new StringBuffer(next);
//        while(sb.toString().contains("ac")){
//            String s = sb.toString();
//            int ac = s.indexOf("ac");
//            sb.setCharAt(ac,'c');
//            sb.setCharAt(ac+1,'a');
//            num++;
//        }
//        System.out.println(num);
        /**
         * 输入一个整数n
         * 输出最多可能的结果 由 a b 组成的，不含aba，bab
         */
        int n = sc.nextInt();
        List<String> list =new ArrayList<>();
        int resultNum=0;
        for(int i=0;i<n;i++){
            resultNum+=getResult(list,i);

        }
//        if(n<=3){
//            Set<String> collect= list.stream().filter(e->!e.contains("101") && !e.contains("010")&&e.contains("0")&& e.contains("1")).collect(Collectors.toSet());
//            list=collect.stream().collect(Collectors.toList());
//        }
//        int size = list.size();
        System.out.println(resultNum%998244353);
    }

    private static int  getResult(List<String> list,int ephco) {
        int size = list.size();
        int nmm=0;
        if(ephco==0){
            list.add("0");
            list.add("1");
            return 0;
        }
        for(int j=0;j<size;j++){
            String e1 = list.get(j) + "0";
            if(!e1.contains("101") && !e1.contains("010")&&e1.contains("0")&& e1.contains("1")){
                list.add(e1);
                nmm++;
            }else if(ephco<=1){
                list.add(e1);
            }

            String e2 = list.get(j) + "1";
            if(!e2.contains("101") && !e2.contains("010")&&e2.contains("0")&& e2.contains("1")){
                list.add(e2);
                nmm++;
            }else if(ephco<=1){
                list.add(e2);
            }
//            list.add(list.get(j)+"0");
//            list.add(list.get(j)+"1");
        }
        for(int jj=0;jj<size;jj++){
            list.remove(0);
        }
//        if(ephco>=3){
//            Set<String> collect = list.stream().filter(e ->
//                    !e.contains("101") && !e.contains("010")&&e.contains("0")&& e.contains("1") )
//                    .collect(Collectors.toSet());
//            list=collect.stream().collect(Collectors.toList());
//        }


        return nmm;
    }
}
