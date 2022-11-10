import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangleTwo {

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        }
        if (rowIndex == 1) {
            return List.of(1);
        }
        if (rowIndex == 2) {
            return List.of(1, 1);
        }

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1, 1));
        int limit = 3;
        ++rowIndex;
        while (limit <= rowIndex) {
            List<Integer> prev = triangle.get(triangle.size() - 1);
            List<Integer> line = new ArrayList<>();
            line.add(1);
            for (int i = 1; i < limit - 1; i++) {
                line.add(prev.get(i) + prev.get(i - 1));
            }
            line.add(1);
            triangle.add(line);
            limit++;
            triangle.remove(triangle.size()-2);
        }
        return triangle.get(triangle.size() - 1);
    }
}
