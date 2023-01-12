package HundredEasySolvedProblems;

public class AddBinary {

  /**
   * Given two binary strings a and b, return their sum as a binary string.
   */

  public static void main(String[] args) {
    System.out.println(addBinary("1000", "1011"));
  }

  public static String addBinary(String a, String b) {
    return add(a, b);
  }

  private static String add(String left, String right) {
    StringBuilder builder = new StringBuilder();

    int leftPointer = left.length() - 1;
    int rightPointer = right.length() - 1;
    int carryOut = 0;

    while (leftPointer >= 0 || rightPointer >= 0) {
      int l = leftPointer < 0 ? 0 : left.charAt(leftPointer) - '0';
      int r = rightPointer < 0 ? 0 : right.charAt(rightPointer) - '0';

      if (l == r && l == 1) {
        if (carryOut > 0) {
          builder.append(1);
        } else {
          builder.append(0);
          carryOut += 1;
        }
      } else {
        if (carryOut > 0) {
          if (l == r && l == 0) {
            carryOut -= 1;
            builder.append(1);
          } else {
            builder.append(0);
          }
        } else {
          if (l == r && l == 0) {
            builder.append(0);
          } else {
            builder.append(1);
          }
        }
      }

      leftPointer--;
      rightPointer--;
    }

    builder.append("1".repeat(Math.max(0, carryOut)));
    return builder.reverse().toString();
  }
}
