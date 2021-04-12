/**
 * 选择排序
 */
public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {1, 28, 6, 34, 5, 41, 7};
        for (int i = 0; i < arr.length - 1; i++) {//第一趟做i排序
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {//选择最大排序
                if (arr[max] < arr[j]) {
                    max = j;//记录当前最大值的下标位置
                }
            }
            //交换
            if (i != max) { //交换a[i] 与 a[max]
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }

        //排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
