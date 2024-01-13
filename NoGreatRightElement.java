import java.util.Scanner;

public class NoGreatRightElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = scan.nextInt();
        int max = arr[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
    }
}
