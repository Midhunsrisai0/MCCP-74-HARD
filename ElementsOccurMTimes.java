import java.util.LinkedHashMap;
import java.util.Scanner;
public class ElementsOccurMTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int e = scan.nextInt();
            hm.put(e, hm.getOrDefault(e, 0) + 1);
        }
        for (int i : hm.keySet()) if (hm.get(i) >= m) System.out.print(i + " ");   
    }
}