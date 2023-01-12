package HundredEasySolvedProblems;

import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    static boolean isIsomorphic(String s, String t) {
        char[] first = new char[128];
        char[] second = new char[128];

        int lp = 0;
        int rp = t.length() - 1;

        while (lp <= rp) {
            char lff = s.charAt(lp);
            char lfs = t.charAt(lp);

            if (first[lff] == '\u0000') {
                first[lff] = lfs;
            }
            if (second[lfs] == '\u0000') {
                second[lfs] = lff;
            }
            char rff = s.charAt(rp);
            char rfs = t.charAt(rp);
            if (first[rff] == '\u0000') {
                first[rff] = rfs;
            }
            if (second[rfs] == '\u0000') {
                second[rfs] = rff;
            }
            if (first[lff] != lfs || second[lfs] != lff || first[rff] != rfs || second[rfs] != rff) {
                return false;
            }
            rp--;
            lp++;
        }
        return true;
    }
}
