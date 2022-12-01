public class AddDigits {

  /*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.*/
  public static void main(String[] args) {
    System.out.println(addDigits(1234));
  }

  public static int addDigits(int num) {
    if (num == 0) {
      return 0;
    }
    num %= 9;
    return num == 0 ? 9 : num;
  }

}
