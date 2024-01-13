import java.util.Scanner;

public class GreatestInNeighbourhood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        if(n==1) System.out.println(a[0]);
        else {
            if(a[0]>a[1]) System.out.print(0+" ");
            for (int i = 1; i < n - 1; i++) {
                if (a[i] > a[i - 1] && a[i] > a[i + 1])
                    System.out.print(i + " ");
            }
            if (a[n - 1] > a[n - 2])
                System.out.println(n - 1);
        }
    }
}
