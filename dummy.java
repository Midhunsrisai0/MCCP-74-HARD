import java.util.TreeSet;

public class dummy {
    public static void main(String[] args) {
        String fs = "";
        int minLength = strs[0].length();
        for (String i : strs) {
            int l;
            l = i.length();
            if (l < minLength)
                minLength = l;
        }
        for (int i = 0; i < minLength; i++) {
            TreeSet<Character> ts = new TreeSet<>();
            for (String s : strs)
                ts.add(s.charAt(i));
            if (ts.size == 1)
                fs += s.charAt(i);
            else
                return fs;
        }
        return fs;
    }
}
