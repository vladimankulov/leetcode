import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(generate(4));
    }

    public static List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return Collections.emptyList();
        }
        if (numRows == 1) {
            return List.of(List.of(1));
        }
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1));
        triangle.add(List.of(1, 1));
        int limit = 3;
        while (limit <= numRows) {
            List<Integer> prev = triangle.get(triangle.size() - 1);
            List<Integer> line = new ArrayList<>();
            line.add(1);
            for (int i = 1; i < limit - 1; i++) {
                line.add(prev.get(i) + prev.get(i - 1));
            }
            line.add(1);
            triangle.add(line);
            limit++;
        }
        return triangle;
    }
}
