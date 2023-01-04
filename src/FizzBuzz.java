import java.util.LinkedList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5. answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5. answer[i] == i (as a string) if none of the above
 * conditions are true.
 */

public class FizzBuzz {

  public static void main(String[] args) {

  }

  public static List<String> fizzBuzz(int n) {
    String fizz = "Fizz";
    String buzz = "Buzz";
    String fizzBuzz = "FizzBuzz";
    List<String> result = new LinkedList<>();
    for (int i = 1; i < n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        result.add(fizzBuzz);
        continue;
      }
      if (i % 5 == 0) {
        result.add(buzz);
        continue;
      }
      if (i % 3 == 0) {
        result.add(fizz);
        continue;
      }
      result.add(Integer.toString(i));
    }
    return result;
  }

}
