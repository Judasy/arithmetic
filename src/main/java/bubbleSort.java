/**
 * 冒泡排序
 */
public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {1, 28, 6, 34, 5, 41, 7};
        for (int i = 0; i < arr.length - 1; i++) {//第一趟循环获取数据元素
            for (int j = i + 1; j < arr.length; j++) {//第二趟比较相邻的两个元素大小
                if (arr[i] < arr[j]) {//小的放后面，由大到小排序
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
