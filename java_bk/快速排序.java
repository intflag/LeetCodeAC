public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{11, 8, 3, 9, 7, 1, 2, 5};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        //获取中间值
        int mod = getMod(arr, left, right);
        //左右区间各自排序
        quickSort(arr, left, mod - 1);
        quickSort(arr, mod + 1, right);
    }

    /**
     * 获取中间值
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private static int getMod(int[] arr, int left, int right) {
        int mod = left;
        int flag = arr[right];
        for (int i = left; i < right; i++) {
            if (arr[i] < flag) {
                if (i != mod) {
                    swap(arr, i, mod);
                }
                mod++;
            }
        }
        swap(arr, mod, right);
        return mod;
    }

    /**
     * 交换两个数
     *
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}