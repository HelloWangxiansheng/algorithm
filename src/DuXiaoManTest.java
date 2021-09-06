import java.util.Scanner;

public class DuXiaoManTest {
    /**
     * 描述：有一个输入由X或O组成，字符串，O表示应该处理，X表示不能处理
     *有k个人对其进行评价，1为处理，0不处理，要求，只能处理
     *输入11111000...表示k个人的评价
     * 输出：NO YES表示这个人是否正确操作，当不能处理的时候被处理了，是个错误的方式，输出NO
     *
     * 输入
     * OOXX
     * 3
     * 1111
     * 1100
     * 0100
     *
     * 输出
     * NO
     * YES
     * YES
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String next = sc.next();
        int m = sc.nextInt();
        int length = next.length();
        int[][] arr = new int[m][length];
        for(int i=0;i<m;i++){
            String next1 = sc.next();
            for(int j=0;j<length;j++){
                arr[i][j]=Integer.parseInt(next1.substring(j,j+1));
            }
        }
        String [] result =new String[m];
        for(int k=0;k<length;k++) {
            String cc = next.charAt(k) + "";
            if (cc.equals("X")) {
                for (int u = 0; u < m; u++) {
                    if (arr[u][k] == 1) {
                        result[u] = "NO";
                    } else {
                        continue;
                    }
                }

            }
        }
        for(int i=0;i<m;i++){
            if("NO".equals(result[i])){
                System.out.println("NO");
           }else {
                System.out.println("YES");
            }
        }

        //        int size = sc.nextInt();
//        int kk =sc.nextInt();
//        int [] arr = new int[size];
//        for(int i=0;i<size;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        int num =0;
//        int an=0;
//        for(int j=0;j<size;j++){
//            num+=size-j-1;
//            for(int k=j+1;k<size;k++){
//                if(arr[k]-arr[j]<=kk){
//                    an++;
//                }
//            }
//        }
//        if(num!=0){
//            System.out.println(an+"/"+num);
//        }else {
//            System.out.println("0/1");
//        }


    }
}
