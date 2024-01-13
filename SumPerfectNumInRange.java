import java.util.Scanner;

public class SumPerfectNumInRange {

    static boolean isPerfect(int n) {
        int p=0;
        for (int i = 1; i < n; i++)
            if (n % i == 0) {
                p += i;
            }
        if (p == n)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt(), r = scan.nextInt();
        int s = 0;
        for (int i = l; i <= r; i++)
            if (isPerfect(i)) s += i;
        System.out.println(s);
        
    }
}
