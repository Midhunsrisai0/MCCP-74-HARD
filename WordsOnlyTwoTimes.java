import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordsOnlyTwoTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        int count=0;
        for (String s : hm.keySet())
            if (hm.get(s) == 2)
                count++;
        System.out.print("Words that appear twice: "+count);
    }
}
