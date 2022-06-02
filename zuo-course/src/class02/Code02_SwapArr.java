package class02;


public class Code02_SwapArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        swapArr(arr, 0, 1);
        System.out.println(arr[0] + "," + arr[1]);
    }

    public static void swapArr(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
