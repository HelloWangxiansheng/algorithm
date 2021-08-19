import java.util.Scanner;

/**
 * @author wangwangwang <wangwangwang@kuaishou.com>
 * Created on 2021-08-19
 */
public class InterviewsAlgorithm {

    public static void main(String[] args) {

        //输入一个整数，转换成16进制，并判断是否为回文数，不是返回0，是返回1
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        Integer2Hex(i);
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
