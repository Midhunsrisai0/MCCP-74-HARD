import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class UncommonChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        String uncommonChars = "";

        for (char c : s1.toCharArray())
            if (!s2.contains(String.valueOf(c)))
                uncommonChars += String.valueOf(c);

        for (char c : s2.toCharArray())
            if (!s1.contains(String.valueOf(c)))
                uncommonChars += String.valueOf(c);

        System.out.println("Uncommon characters: " + uncommonChars);
    }
}
