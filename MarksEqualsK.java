import java.util.Scanner;

public class MarksEqualsK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        int k = scan.nextInt();
        for (int i = 0; i < n; i++)
            if (arr[i] == k) {
                System.out.println(i);
                System.exit(0);
            }
        System.out.println(-1);
    }
}
