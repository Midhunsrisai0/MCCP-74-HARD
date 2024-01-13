import java.util.ArrayList;
import java.util.Scanner;

public class NumOfWordsMatchInArrayAndString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] inpStrList = new String[n];
        for (int i = 0; i < n; i++)
            inpStrList[i] = scan.nextLine();
        String s = scan.nextLine();
        System.out.println(countWordsMatched(s, inpStrList));
    }

    private static int countWordsMatched(String s, String[] inpList) {
        String[] strList = s.split(" ");
        int count = 0;
        ArrayList<String> al = new ArrayList<>();
        for (String i : inpList)
            for (String j : strList)
                if (i.equals(j) && notExists(al, j)) {
                    al.add(j);
                    count++;
                }
        return count;
    }
    
    private static boolean notExists(ArrayList<String> al, String s) {
        for (String i : al)
            if (i.equals(s))
                return false;
        return true;
    }
}
