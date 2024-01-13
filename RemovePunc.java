import java.util.Scanner;

public class RemovePunc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'|| c==' ')
                sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
