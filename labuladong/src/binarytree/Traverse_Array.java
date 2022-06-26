package binarytree;

public class Traverse_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //traverseIteration(arr);
        traverseRecursion(arr, 0);
    }

    /**
     * 迭代遍历数组
     *
     * @param arr
     */
    public static void traverseIteration(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 递归遍历数组
     *
     * @param arr
     * @param i
     */
    public static void traverseRecursion(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        // 前序位置
        System.out.println("前序位置：" + arr[i]);
        traverseRecursion(arr, i + 1);
        // 后序位置
        System.out.println("后序位置：" + arr[i]);
    }
}
