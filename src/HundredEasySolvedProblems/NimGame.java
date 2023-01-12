package HundredEasySolvedProblems;

public class NimGame {

  /**
   * You are playing the following Nim Game with your friend:
   * <p>
   * Initially, there is a heap of stones on the table. You and your friend will alternate taking
   * turns, and you go first. On each turn, the person whose turn it is will remove 1 to 3 stones
   * from the heap. The one who removes the last stone is the winner. Given n, the number of stones
   * in the heap, return true if you can win the game assuming both you and your friend play
   * optimally, otherwise return false.
   */

  public static void main(String[] args) {

  }

  public static boolean canWinNim(int n) {
    if (n <=3) {
      return true;
    }

    if (n % 4 == 0) {
      return false;
    }

    if (n - 1 % 2 != 0) {
      return true;
    }
    return false;
  }

}
