import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        int numberOfSheetColumnName = 2147483647;
        System.out.println(numberOfSheetColumnName);
        String sheetColumnName = convertToTitle(numberOfSheetColumnName);
        System.out.println(sheetColumnName);
        int generatedNumberOfSheetColumnName = titleToNumber(sheetColumnName);
        System.out.println(generatedNumberOfSheetColumnName + " " + (numberOfSheetColumnName == generatedNumberOfSheetColumnName));
    }

    private static final char[] alphabet = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static String convertToTitle(int columnNumber) {
        if (columnNumber <= 26) {
            return Character.toString(alphabet[columnNumber - 1]);
        }

        StringBuilder result = new StringBuilder();
        while (columnNumber >= 1) {
            int reminder = (columnNumber - 1) % 26;
            result.append(alphabet[reminder]);
            columnNumber = (columnNumber - 1) / 26;
        }
        return result.reverse().toString();
    }

    public static int titleToNumber(String columnTitle) {
        // AA
        // 26 * 1 + 1
        // AG
        // 26 * 1 + 7
        // BB
        // 26 * 2 + 2
        // ZZ
        // 26 * 26 + 26
        // ZZZ
        // 26 * 26 * 26 + 26 * 26 + 26
        // BAZ
        // 26 * 26 * 2 + 26 * 1 + 26
        // AGA
        // 26 * 26 * 1 + 26 * 7 + 1
        // AAAA
        // 26 * 26 * 26 * 1 + 26 * 26 * 1 + 26 * 1 + 1
        // 6 19 17 = FSQ
        // 26 * 26 * 6 + 26 * 19 + 17
        int result = 0;
        int length = columnTitle.length();
        for (int i = 1; i < length; i++) {
            result += Math.pow(26, length - i) * (((int) columnTitle.charAt(i - 1) - 64));
        }
        result += ((int)columnTitle.charAt(columnTitle.length() - 1)) - 64;
        return result;
    }
}
