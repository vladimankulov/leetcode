public class CheckIfTwoStringArraysAreEquivalent {

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "cd"}, new String[]{"a", "b", "c", "d"}));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int leftP = 0;
        int rightP = 0;

        StringBuilder lString = new StringBuilder();
        StringBuilder rString = new StringBuilder();
        while (leftP <= word1.length - 1 || rightP <= word2.length - 1) {
            if (leftP <= word1.length - 1) {
                lString.append(word1[leftP]);
            }
            ++leftP;
            if (rightP <= word2.length - 1) {
                rString.append(word2[rightP]);
            }
            ++rightP;
        }
        return lString.toString().equals(rString.toString());
    }
}
