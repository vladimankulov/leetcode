import java.util.HashMap;

public class WordPattern {

  public static void main(String[] args) {
    System.out.println(wordPattern("abc", "dog cat dog"));
  }

  public static boolean wordPattern(String pattern, String s) {
    if ((pattern == null && s != null) || (pattern != null && s == null)) {
      return false;
    }
    if (pattern == null) {
      return true;
    }

    String[] splitted = s.split(" ");

    if (pattern.length() != splitted.length) {
      return false;
    }

    HashMap<Character, String> charPattern = new HashMap<>();
    HashMap<String, Character> wordPattern = new HashMap<>();

    for (int i = 0; i < splitted.length; i++) {
      Character current = pattern.charAt(i);
      if ((charPattern.containsKey(current) && current != wordPattern.get(splitted[i]))
          || wordPattern.containsKey(splitted[i]) && current != wordPattern.get(splitted[i])) {
        return false;
      }
      charPattern.put(current, splitted[i]);
      wordPattern.put(splitted[i], current);
    }

    return true;
  }
}
