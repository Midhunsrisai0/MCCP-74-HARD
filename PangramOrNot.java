import java.util.Scanner;
import java.util.TreeSet;

public class PangramOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scan.nextLine();
        TreeSet<Character> ts = new TreeSet<>();
        for (int i = 0; i < input.length(); i++) if(input.charAt(i)>='a' && input.charAt(i)<='z')
            ts.add(input.charAt(i));
        if (ts.size() == 26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
