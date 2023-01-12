package HundredEasySolvedProblems;

/**
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and
 * grid[i][j] = 0 represents water.
 * <p>
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely
 * surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * <p>
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the
 * island. One cell is a square with side length 1. The grid is rectangular, width and height don't
 * exceed 100. Determine the perimeter of the island.
 */
public class IslandPerimeter {

  public static void main(String[] args) {
    int[][] ocean = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
//    int[][] ocean = {{1}};
    System.out.println(islandPerimeter(ocean));
  }

  /*
   * [0,1,0,0]
   * [1,1,1,0]
   * [0,1,0,0]
   * [1,1,0,0]
   * */
  public static int islandPerimeter(int[][] grid) {
    int perimeter = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 0) {
          continue;
        }
        int up = lookUp(grid, i - 1, j);
        int down = lookDown(grid, i + 1, j);
        int left = lookLeft(grid, i, j - 1);
        int right = lookRight(grid, i, j + 1);
        perimeter += up + down + left + right;
      }
    }
    return perimeter;
  }

  /*
   * [0,1,0,0]
   * [1,1,1,0]
   * [0,1,0,0]
   * [1,1,0,0]
   * */
  private static int lookUp(int[][] grid, int row, int column) {
    if (row < 0 && grid[row + 1][column] == 1) {
      return 1;
    }
    if (row >= 0 && grid[row][column] == 0) {
      return 1;
    }
    return 0;
  }
  /*
   * [0,1,0,0]
   * [1,1,1,0]
   * [0,1,0,0]
   * [1,1,0,0]
   * */

  private static int lookRight(int[][] grid, int row, int column) {
    if (column == grid[row].length && grid[row][column -1] == 1) {
      return 1;
    }
    if (column >= grid[row].length) {
      return 0;
    }
    if (grid[row][column] == 0) {
      return 1;
    }
    return 0;
  }

  /*
   * [0,1,0,0]
   * [1,1,1,0]
   * [0,1,0,0]
   * [1,1,0,0]
   * */
  private static int lookLeft(int[][] grid, int row, int column) {
    if (column < 0 && grid[row][column + 1] == 1) {
      return 1;
    }
    if (column >= 0 && grid[row][column] == 0) {
      return 1;
    }
    return 0;
  }
  /*
   * [0,1,0,0]
   * [1,1,1,0]
   * [0,1,0,0]
   * [1,1,0,0]
   * */

  private static int lookDown(int[][] grid, int row, int column) {
    if (row == grid.length && grid[row - 1][column] == 1) {
      return 1;
    }
    if (row >= grid.length) {
      return 0;
    }
    if (grid[row][column] == 0) {
      return 1;
    }
    return 0;
  }

}
