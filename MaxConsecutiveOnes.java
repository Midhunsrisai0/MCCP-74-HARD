import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        int start=0, end=0, max = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (flag == true && arr[i] == 1 && i == n - 1) {
                end = i;
                int c = end - start + 1;
                if (c > max)
                    max = c;
            }
            if (arr[i] == 1 && !flag) {
                start = i;
                end = i;
                flag = true;
            } else if (arr[i] == 1 && flag)
                end = i;
            else if (arr[i] != 1) {
                flag = false;
                int c = end - start + 1;
                if (c > max)
                    max = c;
            }
        }
        System.out.println(max);
    }
}
