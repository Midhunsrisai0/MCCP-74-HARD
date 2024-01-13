import java.util.Scanner;

public class SplitOnSpaceRAndN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 1;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ' || c == '\n' || c == '\t')
                flag = true;
            else if (flag) {
                count++;
                flag = false;
            }
        }
        System.out.println(count);
    }
}