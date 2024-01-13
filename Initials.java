import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(findInitials(name));

    }
    public static String findInitials(String name) {
        String[] words = name.split(" ");
        StringBuilder initials = new StringBuilder();

        for (String word : words) {
            initials.append(word.charAt(0)+" ");
        }

        return initials.toString().toUpperCase();
    }
}
