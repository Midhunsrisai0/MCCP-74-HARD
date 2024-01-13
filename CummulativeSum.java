import java.util.Scanner;

public class CummulativeSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        cumulativeSum(arr, n);
    }

    private static void cumulativeSum(int[] arr, int n) {
        int sum = 0;
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            System.out.print(sum + " ");
        }
        System.out.println("]");
    }
}
