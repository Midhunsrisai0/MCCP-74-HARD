import java.util.LinkedHashMap;
import java.util.Scanner;

public class UniqueIntCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = 0;
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < n; i++)
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        for (int i : hm.keySet())
            if (hm.get(i) == 1)
                c++;
        System.out.println(c);
        
    }
}
