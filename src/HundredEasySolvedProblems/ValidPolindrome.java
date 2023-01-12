package HundredEasySolvedProblems;

public class ValidPolindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("0P"));
        System.out.println(isPalindrome("a."));
    }

    public static boolean isPalindrome(String s) {
        int leftP = 0;
        int rightP = s.length() - 1;
        //A man, a plan, a canal: Panama
        while (leftP <= rightP) {
            char left = s.charAt(leftP);
            char right = s.charAt(rightP);
            if (!Character.isLetterOrDigit(left)) {
                ++leftP;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                --rightP;
                continue;
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }
            ++leftP;
            --rightP;
        }
        return true;
    }
}
