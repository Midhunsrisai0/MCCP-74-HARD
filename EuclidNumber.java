import java.util.Scanner;

public class EuclidNumber {
    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;        
    }
    static boolean euclidOrNot(int n) {
        int p = 1;
        for (int i = 2; i < n; i++) {
            if (p >= n)
                return false;
            if (isPrime(i)) {
                p *= i;
                System.out.println(i+"---"+p);
                if (p + 1 == n)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean res;
        res = euclidOrNot(n);
        System.out.println(res);
    }
}
