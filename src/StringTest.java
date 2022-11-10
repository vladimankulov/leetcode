
public class StringTest {

    public static void main(String[] args) {
        String s = "1";
        String s1 = "1!";

        for (int i = 0; i < 10; i++) {
            String a = s(s);
            System.out.println(a == s1);
        }
    }

    public static String s(String s) {
        return s + "!";
    }
}
