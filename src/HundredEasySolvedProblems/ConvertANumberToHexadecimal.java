package HundredEasySolvedProblems;

/**
 * Given an integer num, return a string representing its hexadecimal representation. For negative
 * integers, two’s complement method is used.
 * <p>
 * All the letters in the answer string should be lowercase characters, and there should not be any
 * leading zeros in the answer except for the zero itself.
 * <p>
 * Note: You are not allowed to use any built-in library method to directly solve this problem.
 */
public class ConvertANumberToHexadecimal {

  public static void main(String[] args) {
    System.out.println(toHex(-2));
  }

  public static String toHex(int num) {
    if (num == 0) {
      return "0";
    }

    char[] hexTable = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c',
        'd', 'e', 'f'};

    StringBuilder builder = new StringBuilder();
    while (num != 0) {
      builder.insert(0, hexTable[(num & 15)]);
      num >>>= 4;
    }
    return builder.toString();
  }

  private static int twoComplementConvert(int rev) {
    if ((rev & 1) == 1) {
      int count = 0;
      int shifts = 0;
      while ((rev & 1) == 1) {
        rev >>= 1;
        count = 1;
        shifts += 1;
      }
      if (count == 1) {
        rev ^= 1;
      }
      for (int i = 0; i < shifts; i++) {
        rev <<= 1;
      }
    } else {
      rev <<= 1;
      rev ^= 1;
    }
    return rev;
  }

}
