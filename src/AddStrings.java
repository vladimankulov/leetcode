/**
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and
 * num2 as a string.
 * <p>
 * You must solve the problem without using any built-in library for handling large integers (such
 * as BigInteger). You must also not convert the inputs to integers directly.
 */

public class AddStrings {

  public static void main(String[] args) {
    System.out.println(addStrings("11", "123"));
  }

  public static String addStrings(String num1, String num2) {
    int lP = num1.length() - 1;
    int rP = num2.length() - 1;

    int carry = 0;
    StringBuilder builder = new StringBuilder();

    while (lP >= 0 || rP >= 0) {
      int sum = carry;
      int left = 0;
      int right = 0;
      if (lP >= 0) {
        left = num1.charAt(lP) - 48;
      }
      if (rP >= 0) {
        right = num2.charAt(rP) - 48;
      }
      sum += left + right;
      lP--;
      rP--;
      builder.append(sum % 10);
      carry = sum / 10;
    }
    if (carry != 0) builder.append(carry);

    return builder.reverse().toString();
  }

}
