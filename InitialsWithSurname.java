import java.util.Scanner;

public class InitialsWithSurname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String ns = "";
        String[] sAr = s.split(" ");
        for (int i = 0; i < sAr.length - 1; i++)
            ns = ns + sAr[i].charAt(0) + ". ";
        ns += sAr[sAr.length - 1];
        System.out.println(ns);
    }
}
