import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        boolean flag=false;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = Integer.parseInt(s);
        s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("It is a Duck Number!");
        else
            System.out.println("It is not a Duck Number!");
        
    }
}
