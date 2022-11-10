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

    private static final Map<Character, Integer> excelSheet = new HashMap<>() {{
        put('A', 1);
        put('B', 2);
        put('C', 3);
        put('D', 4);
        put('E', 5);
        put('F', 6);
        put('G', 7);
        put('H', 8);
        put('I', 9);
        put('J', 10);
        put('K', 11);
        put('L', 12);
        put('M', 13);
        put('N', 14);
        put('O', 15);
        put('P', 16);
        put('Q', 17);
        put('R', 18);
        put('S', 19);
        put('T', 20);
        put('U', 21);
        put('V', 22);
        put('W', 23);
        put('X', 24);
        put('Y', 25);
        put('Z', 26);
    }};

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
