import java.util.LinkedHashMap;
import java.util.Scanner;

public class MaxCharSameinBothStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        int maxCount = 0;
        char maxChar= s1.charAt(0);
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < s1.length(); i++)
            hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i), 0) + 1);
        for (Character c : hm.keySet())
            if (hm.get(c) > maxCount) {
                maxChar = c;
                maxCount = hm.get(c);
            }
        
        boolean exists = false;
        hm = new LinkedHashMap<>();
        for (int i = 0; i < s2.length(); i++)
            hm.put(s2.charAt(i), hm.getOrDefault(s2.charAt(i), 0) + 1);
        for (Character c : hm.keySet())
            if (c == maxChar) {
                exists = true;
                if (hm.get(c) == maxCount)
                    System.out.println("YES.");
                else {
                    System.out.println("NO.");
                    break;
                }
            }
        if(!exists) System.out.println("NO.");

    }
}
