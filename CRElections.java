import java.util.LinkedHashMap;
import java.util.Scanner;

public class CRElections {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int req = n/2;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < n; i++)
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        for (int i : hm.keySet())
            if (hm.get(i) > req) {
                System.out.println(i);
                System.exit(0);
            }
        System.out.println(-1);
    }
}
