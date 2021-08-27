import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author wangwangwang <wangwangwang@kuaishou.com>
 * Created on 2021-08-27
 */
public class SortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {5, 9, 1, 9, 5, 3, 7, 6, 1};
        Arrays.stream(arr).forEach(e-> System.out.print(" "+e));
        quickSort(arr,0,arr.length-1);
        System.out.println(">>");
//        Arrays.stream(arr).sorted().forEach(e-> System.out.println(e));
        Arrays.stream(arr).forEach(e-> System.out.print(" "+e));
    }

    /**
     * 快排
     * @param arr
     * @param start
     * @param end
     */
    private static void quickSort(int[] arr,int start,int end){
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) quickSort(arr,start,i-1);
        if (j+1<end) quickSort(arr,j+1,end);
    }

}
