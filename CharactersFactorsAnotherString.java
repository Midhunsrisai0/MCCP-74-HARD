import java.util.LinkedHashMap;
import java.util.Scanner;

public class CharactersFactorsAnotherString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        LinkedHashMap<Character, Integer[]> hm = new LinkedHashMap<>();
        for (char i : s1.toCharArray()) {
            hm.put(i, new Integer[] { hm.getOrDefault(i, new Integer[] { 0, 0 })[0] + 1, 0 });
        }

        for (char i : s2.toCharArray()) {
            if (hm.containsKey(i)) {
                Integer[] value = hm.get(i);
                hm.put(i, new Integer[] { value[0], value[1] + 1 });
            } else {
                hm.put(i, new Integer[] { 0, 1 });
            }
        }
        for (Character c : hm.keySet()) {
            int v1 = hm.get(c)[0];
            int v2 = hm.get(c)[1];
            if (v1 == 0 || v2 == 0 || v1 % v2 == 0 || v2 % v1 == 0)
                continue;
            else {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");

        
    }
}
