import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeSet;
public class KthMostOccuringEle {
    static LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i : hm.keySet()) {
            ts.add(hm.get(i));
        }
        int x = ts.size();
        k = x - k;
        int a[] = new int[x];
        int i = 0;
        for (Integer v : ts) {
            a[i] = v;
            i++;
        }
        for (int j : hm.keySet()) {
            if(hm.get(j) == a[k]) System.out.print(j+" ");
        }

    }
}
