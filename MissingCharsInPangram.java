import java.util.ArrayList;
import java.util.Scanner;

public class MissingCharsInPangram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Character> al = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++)
            al.add(ch);
        String input = scan.nextLine().toLowerCase();
        ArrayList<Character> copy = new ArrayList<>(al);
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z')
                copy.remove(Character.valueOf(currentChar));
        }
        StringBuilder ns = new StringBuilder();
        for (Character c : copy) {
            ns.append(c);
        }
        System.out.println(ns.toString());
    }
}
