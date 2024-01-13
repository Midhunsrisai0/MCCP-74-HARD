import java.util.Arrays;

public class ReArrangeArrayEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void rearrangeArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    if (i > 1 && arr[i - 2] > arr[i - 1]) {
                        swap(arr, i - 2, i - 1);
                    }
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    swap(arr, i, i - 1);
                    if (i > 1 && arr[i - 2] < arr[i - 1]) {
                        swap(arr, i - 2, i - 1);
                    }
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
