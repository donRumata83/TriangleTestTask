import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triangle {
    private static final int SCALENE = 1;
    private static final int ISOSCELES = 2;
    private static final int EQUILATERAL = 3;
    private static final int ERROR = 4;

    public int getTriangleType(int a, int b, int c) {
        List<Integer> list = Arrays.asList(a, b, c);
        Collections.sort(list);
        if (list.get(0) <= 0) return ERROR;
        if ((list.get(0) + list.get(1)) <= list.get(2)) return ERROR;
        if (list.get(0) == list.get(1) && list.get(1) == list.get(2)) return EQUILATERAL;
        else {
            if (list.get(0) == list.get(1) || list.get(1) == list.get(2)) return ISOSCELES;
            else return SCALENE;
        }
    }
}
