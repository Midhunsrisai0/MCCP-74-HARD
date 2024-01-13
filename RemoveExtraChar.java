import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class RemoveExtraChar {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        Scanner scan = new Scanner(System.in);
        String s1=scan.nextLine(), s2 = scan.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for(int i=0;i<s2.length();i++){
            hm.put(s2.charAt(i), hm.getOrDefault(s2.charAt(i), 0) + 1);
        }
        for (Character c : hm.keySet()) {
            if (hm.get(c) % 2 != 0) {
                System.out.println("Unique character is: " + c);
                System.exit(0);
            }
        }
        System.out.println("No unique character.");
    }
}
