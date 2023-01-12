package HundredEasySolvedProblems;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 * A binary watch has 4 LEDs on the top to represent the hours (0-11), and 6 LEDs on the bottom to
 * represent the minutes (0-59). Each LED represents a zero or one, with the least significant bit
 * on the right. Given an integer turnedOn which represents the number of LEDs that are currently on
 * (ignoring the PM), return all possible times the watch could represent. You may return the answer
 * in any order.
 */
public class BinaryWatch {

  public static void main(String[] args) {
    System.out.println(Integer.bitCount(3));
  }

  public static List<String> readBinaryWatch(int turnedOn) {
    if (turnedOn < 0 || turnedOn >= 9) {
      return Collections.emptyList();
    }
    List<String> display = new LinkedList<>();
    for (int hour = 0; hour <= 11; hour++) {
      for (int minutes = 0; minutes <= 59; minutes++) {
        if (Integer.bitCount(hour) + Integer.bitCount(minutes) == turnedOn) {
          StringBuilder builder = new StringBuilder();
          builder.append(hour).append(":");
          if (minutes < 10) {
            builder.append(0).append(minutes);
          } else {
            builder.append(minutes);
          }
          display.add(builder.toString());
        }
      }
    }
    return display;
  }

}
