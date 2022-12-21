
/**
 * We are playing the Guess Game. The game is as follows:
 * <p>
 * I pick a number from 1 to n. You have to guess which number I picked.
 * <p>
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than
 * your guess.
 * <p>
 * You call a pre-defined API int guess(int num), which returns three possible results:
 * <p>
 * -1: Your guess is higher than the number I picked (i.e. num > pick).<p> 1: Your guess is lower
 * than the number I picked (i.e. num < pick). <p>0: your guess is equal to the number I picked
 * (i.e. num == pick). Return the number that I picked.
 */
public class GuessNumberHigherOrLower {

  private static int guestNumber = 1702766719;

  private static int guess(int n) {
    if (n > guestNumber) {
      return -1;
    }
    return n == guestNumber ? 0 : 1;
  }

  public static void main(String[] args) {
    System.out.println(guessNumber(2126753390));
  }

  public static int guessNumber(int n) {
    int left = 0;
    int right = 0;

    while (true) {
      int result = guess(n);

      if (result == -1) {
        right = n;
        n /= 2;
        left = n;
      }

      if (result == 0) {
        return n;
      }

      if (result > 0) {
        break;
      }
    }
    while (true) {
      long median = ((long) left + (long) right) / 2;
      n = (int) median;
      int result = guess(n);

      if (result == -1) {
        right = n;
      } else if (result == 1) {
        left = n;
      } else if (result == 0) {
        break;
      }
    }
    return n;
  }
}
