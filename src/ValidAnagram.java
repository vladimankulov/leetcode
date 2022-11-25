import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class ValidAnagram {

  public static void main(String[] args) {
    System.out.println(isAnagramUsingAlphabetOrder("aam", "ram"));
  }

  public static boolean isAnagramUsingHashMap(String s, String t) {
    if (s == null || t == null) {
      return false;
    }

    if (s.length() != t.length()) {
      return false;
    }
    Map<Character, Integer> sm = new HashMap<>();
    Map<Character, Integer> tm = new HashMap<>();
    for (char c : s.toCharArray()) {
      sm.compute(c, (k, v) -> v == null ? 1 : v + 1);
    }
    for (char c : t.toCharArray()) {
      tm.compute(c, (k, v) -> v == null ? 1 : v + 1);
    }
    for (Entry<Character, Integer> e : sm.entrySet()) {
      if (!Objects.equals(e.getValue(), tm.get(e.getKey()))) {
        return false;
      }
    }
    return true;
  }

  public static boolean isAnagramUsingAlphabetOrder(String s, String t) {
    int[] freq1 = new int[26];
    int[] freq2 = new int[26];

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      freq1[c - 'a'] += 1;
    }

    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      freq2[c - 'a'] += 1;
    }
    for (int i = 0; i < 26; i++) {
      if (freq1[i] != freq2[i]) {
        return false;
      }
    }
    return true;
  }

}
